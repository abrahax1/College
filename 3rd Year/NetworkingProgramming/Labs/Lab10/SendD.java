import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.FlowLayout;

public class SendD extends JFrame
{
    private JTextField inputMessage;
    private JLabel label;
    private JButton button;
    private JPanel container;

    public SendD()
    {
        label = new JLabel("Enter message");
        inputMessage = new JTextField(10);
        button = new JButton("Submit");
        button.addActionListener((ActionListener) new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                sendMessage(inputMessage.getText());
            }
        });
        container = (JPanel) getContentPane();

        container.setLayout(new FlowLayout());
        container.add(label);
        container.add(button);
        container.add(inputMessage);
        
        setSize(500, 200);
        setVisible(true);
    }

    private void sendMessage(String message)
    {
        try{
            System.out.println("Opening Send Message Sever");
            InetAddress ia = InetAddress.getByName("127.0.0.1");
            int port = 4000;
            try (MulticastSocket ms = new MulticastSocket(port)) 
            {
                System.out.println("Message: "  + message);
                byte[] data = message.getBytes();
                DatagramPacket dp = new DatagramPacket(data, data.length, ia, port);
                System.out.println("Sending message to client");
                ms.send(dp);
            }
        }
        catch(Exception e)
        {
            System.err.println(e);
        }
    }

    public static void main(String[] args) throws Exception 
    {
        SendD app = new SendD();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }    
}

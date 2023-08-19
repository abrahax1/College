import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.FlowLayout;

public class ReceiveD extends JFrame
{
    private JLabel label;
    private JPanel containter;

    public ReceiveD()
    {
        label = new JLabel("Wating for message ");
        containter = (JPanel) getContentPane();

        containter.setLayout(new FlowLayout());
        containter.add(label);
        
        setSize(500, 200);
        setVisible(true);
        
        receiveMessage(label);
    }

    private void receiveMessage(JLabel label)
    {
        try
        {
            InetAddress ia = InetAddress.getByName("224.2.2.2");
            int port = 4000;
            try (MulticastSocket mSocket = new MulticastSocket(port)) {
                byte[] data = new byte[1024];
                DatagramPacket dp = new DatagramPacket(data, data.length, ia, port);
                mSocket.receive(dp);
                System.out.println("Received Data fom MulticastGroup: " + new String (dp.getData()));
                label.setText(new String (dp.getData()));
            }
        }
        catch(Exception e)
        {
            System.err.println(e);
        }
    }
    public static void main(String[] args)
    {
        ReceiveD app = new ReceiveD();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

import java.net.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Server extends JFrame implements ActionListener 
{   
    JButton b1;
    JTextField t1;
    
    public Server()
    {
        super("Server"); 
        Container container = getContentPane();  
        container.setLayout(new FlowLayout());
        b1 = new JButton("Send to Client");
        t1 = new JTextField(30);
        container.add(b1);
        container.add(t1);              
        setSize( 400, 300 );
        setVisible( true );
        b1.addActionListener(this); 
        int port = 5000;
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        try 
        {
			DatagramSocket server = new DatagramSocket();
            System.out.println("Server is running in port: " + port);
			String message = t1.getText();
			byte data [] = message.getBytes();
			DatagramPacket sendPacket = new DatagramPacket(data, data.length,InetAddress.getLocalHost(), port);
			System.out.println("Sending Data to Client");
			server.send(sendPacket);
			server.close();
		}
		catch(Exception ex) 
        {
			System.out.println(ex);
		}
    }

	public static void main(String[] args)
    {
        Server application = new Server();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
import java.awt.Container;
import java.awt.FlowLayout;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Client extends JFrame 
{
	public Client()
	{
		super("Client");
		JLabel label = new JLabel("Seerver data will print here");
		Container container = getContentPane();
		container.setLayout(new FlowLayout());
		container.add(label);
		setSize(400, 300);
		setVisible(true);
		int port = 5000
		try 
		{
			DatagramSocket client = new DatagramSocket(port);
			byte data[] = new byte[100];
			DatagramPacket receivePacket = new DatagramPacket(data, data.length);
			System.out.println("Client is Running");
			client.receive(receivePacket);
			while(true)
			{
				label.setText("Message from Server: " + new String (receivePacket.getData()));
			}
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
	}
	public static void main(String[] args)
	{
		Client application = new Client();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
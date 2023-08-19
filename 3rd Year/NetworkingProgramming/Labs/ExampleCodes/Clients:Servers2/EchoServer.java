import java.net.*;
import java.io.*;
public class EchoServer 
{
	public static void main(String[] args) 
	{
		try 
		{
			ServerSocket server = new ServerSocket( 4000, 10 );
			System.out.println("Server is Running on port 4000");

			Socket connection = server.accept();
			ObjectOutputStream out = new ObjectOutputStream(connection.getOutputStream());
			ObjectInputStream in = new ObjectInputStream(connection.getInputStream());
			String message = "Connection successful";
			
			while (true) 
			{
				message = (String) in.readObject();
				System.out.println ("Data from Client: " + message);
				out.writeObject(message);

				if (message == "1")
				{
					System.out.println("\nWorks");
				} 
				
			}
		} 
		
		catch (Exception ex) 
		{
			System.err.println(ex);
		} 
	}
}
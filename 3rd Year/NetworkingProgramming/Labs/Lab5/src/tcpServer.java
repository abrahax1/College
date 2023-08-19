import java.net.*;
import java.io.*;
// import java.lang.Math;

public class tcpServer 
{
	public static void main(String[] args) 
	{
		int num1;
		int num2;
		int total;
		
		double num1_float;
		double sqrt;
		
		int exit = 1;  
		
		try 
		{
			// Create Connection
			int port = 5000;
			ServerSocket server = new ServerSocket(port, 10); 
			System.out.println("Server is Running on port " + port);
			
			// allow connection + read + write
			Socket connection = server.accept();
			ObjectOutputStream out = new ObjectOutputStream( connection.getOutputStream() );
			ObjectInputStream in = new ObjectInputStream( connection.getInputStream() );
			
			String message = "Connection successful" + "\n";
			out.writeObject(message); 
			System.out.println(message);
			
			int option = 4;
			
			while(option != 0)
			{	
				// Menu
				message = "--------------------Menu------------------:";
				out.writeObject(message);  
				
				// option 1
				message = "1.- Adding";  
				out.writeObject(message);

				// option 2
				message = "2.- Square root";  
				out.writeObject(message);

				// option 3
				message = "3.- Power of";  
				out.writeObject(message);

				// option 0
				message = "0.- Close " + "\n";  
				out.writeObject(message);
				
				// ask for input
				option = (int) in.readObject();
				
				System.out.println ("Option selected: " + option);

				// Menu actions
				if (option == 1)
				{
					// Number 1
					message = "Enter first number: ";
					out.writeObject(message);
					num1 = (int) in.readObject();
					
					message = "Enter second number: ";
					out.writeObject(message);
					num2 = (int) in.readObject();
					
					// Output
					total = num1 + num2;
					message = "total is: " + total + "\n";
					out.writeObject(message);
					
				}

				else if (option == 2)
				{		
					// Display Message 
					message = "Enter number to find the square root: ";
					out.writeObject(message);
					num1_float = (double) in.readObject();
					
					// Output
					sqrt = Math.sqrt(num1_float);
					message = " Square root is " + sqrt + "\n";
					out.writeObject(message);
					
				}		

				else if (option == 3)
				{
					// Message 1
					message = "Enter first number: ";
					out.writeObject(message);
					num1 = (int) in.readObject();
					
					// Message 2
					message = "Enter power: ";
					out.writeObject(message);
					num2 = (int) in.readObject();
					
					// Output
					total = (int)Math.pow(num1, num2);
					message = "Total is: " + total + "\n";
					out.writeObject(message);
				}	

				else if (option == 0)
				{
					exit = 0;
					// send 0 to shutdown to client
					out.writeObject(exit); 
					server.close(); 
					connection.close();
					System.out.println("Exiting");
				}	
				else
				{
					message = "Please enter correct option /n";
					out.writeObject(message);
				}
			}
		} 
		catch (Exception ex) 
		{
			System.err.println(ex);
		} 
	}
}
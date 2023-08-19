import java.net.*;
import java.io.*;
import java.util.Scanner;


public class tcpClient 
{
	public static void main(String[] args)
	{
		int num1;
		int num2;
		
		double num1_float;
		
		int exit = 1;

		try 
		{
			// Start Connection
			Socket client = new Socket( "localhost",5000); 
			System.out.println("Client is connected to Server");

			ObjectOutputStream out = new ObjectOutputStream(client.getOutputStream());
			ObjectInputStream in = new ObjectInputStream(client.getInputStream());
			
			String message = (String) in.readObject();
			System.out.println ("Data from Server:  " + message);  
			
			// Start program
			int option = 4;
			
			while (option != 0)
			{
				// Display Options
				message = (String) in.readObject();
				System.out.println ("1"+message); 

				//  option 1
				message = (String) in.readObject();
				System.out.println (message); 

				//  option 2
				message = (String) in.readObject();
				System.out.println (message);  

				//  option 3
				message = (String) in.readObject();
				System.out.println (message);  

				//  option 0
				message = (String) in.readObject();
				System.out.println (message); 
				
				System.out.println("Enter an option: ");
				Scanner keyboard = new Scanner(System.in);
				option = keyboard.nextInt();
				
				out.writeObject(option);

				//  error checking
				while (option < 0 || option > 3)
				{
					message = (String) in.readObject();
					System.out.println ("Data from Server: " + message); 
					option = keyboard.nextInt();
					out.writeObject(option);
				}
				
				if (option == 1)
				{
					// Part 1
					message = ( String ) in.readObject();
					System.out.println ("Data from Server:  " + message);  
					num1 = keyboard.nextInt();
					out.writeObject(num1);
					
					// Part 2
					message = ( String ) in.readObject();
					System.out.println ("Data from Server:  " + message); 
					num2 = keyboard.nextInt();
					out.writeObject(num2);
					
					// Output
					message = ( String ) in.readObject();
					System.out.println ("Data from Server:  " + message);  
					
				}

				else if (option == 2)
				{
					// Part 1
					message = ( String ) in.readObject();
					System.out.println ("Data from Server:  " + message);  
					num1_float = keyboard.nextInt();
					out.writeObject(num1_float);
					
					// Output
					message = ( String ) in.readObject();
					System.out.println ("Data from Server:  " + message); 
					
				}	

				else if (option == 3)
				{
					// Part 1
					message = ( String ) in.readObject();
					System.out.println ("Data from Server:  " + message);  
					num1 = keyboard.nextInt();
					out.writeObject(num1);
					
					// Part 2
					message = ( String ) in.readObject();
					System.out.println ("Data from Server:  " + message); 
					num2 = keyboard.nextInt();
					out.writeObject(num2);
					
					// Output
					message = ( String ) in.readObject();
					System.out.println ("Data from Server:  " + message);
				}	

				else if (option == 0)
				{
					exit = (int) in.readObject();
					if(exit == 0)
					{
						System.out.println("Exiting");
						client.close();
						keyboard.close();
					}
					else
					{
						System.out.println("Server has not sent 0 to exit");
					}  // end inner else
				}  // end outer else if
			}  // end while	
		}  // end try 
		
		catch (Exception ex) 
		{
			System.err.println(ex);
		} 
		
	}  
}  
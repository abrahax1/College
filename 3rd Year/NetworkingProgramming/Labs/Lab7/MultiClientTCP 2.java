import java.net.*;
import java.io.*;
import java.util.*;
public class MultiClientTCP
{
    public static void main(String[] args) 
    {
        Socket client = null;
        int port = 5003;

        try 
        {
            client = new Socket("localhost", port); 
            System.out.println("Client connected to server");
        }
        catch (Exception ex) 
        {
            System.err.println(ex);
        }
        
        try 
        {
            Thread reading = new ReadingThread(client);
            Thread writing = new WritingThread(client);
            
            writing.start();
            reading.start();
        }
        catch (Exception ex) 
        {
            System.err.println(ex);
	    }	
    }	
} 
 
class ReadingThread extends Thread 
{
    private Socket socketConnection;
    public ReadingThread (Socket ReadingConnection)
    {
        socketConnection = ReadingConnection;
	}

    public void run() 
    {
        try 
        {    
            ObjectInputStream input = new ObjectInputStream(socketConnection.getInputStream());
            String message;

            while (true)
            {
                message = (String) input.readObject();
                System.out.println ("Client: " + message);
            }

        }
        catch (Exception ex) 
        {
            System.err.println(ex);
        }   
    }   
} 

class WritingThread extends Thread 
{
    private Socket socketConnection;
    public WritingThread (Socket ReadingConnection)
    {
        socketConnection = ReadingConnection;
    }

    public void run() 
    {
        try 
        {
            ObjectOutputStream output = new ObjectOutputStream(socketConnection.getOutputStream());
            String message;
            Scanner scan = new Scanner(System.in);
            
            while (true)
            {
                System.out.print("Client: ");
                message = scan.nextLine();
                output.writeObject(message);
            }   
        }
        catch (Exception ex) 
        {
            System.err.println(ex);
        }   
    }  
}
import java.net.*;
import java.io.*;
import java.util.*;
public class MultiServerTCP
{
    public static void main(String[] args) 
    {
        ServerSocket server = null;
        int port = 5003;
        try 
        {
            server = new ServerSocket(port, 10);
            System.out.println("Server is Running on port " + port);
        }
        catch (Exception ex) 
        {
            System.err.println(ex);
        }

        try 
        {
            System.out.println("Waiting for Client");

            Socket client = server.accept();
            Thread read = new ReadingThread(client);
            Thread write = new WritingThread(client);
            
            write.start();
            read.start();
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
                System.out.println ("Server: " + message);
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
                System.out.print("Server ");
                message = scan.nextLine();
                scan.close();
                output.writeObject(message);
            }
        }
        catch (Exception ex) 
        {
            System.err.println(ex);
        }   
    }   
} 
import java.net.*;
public class App 
{
    public static void main(String[] args)
    {
        try 
        {
            DatagramSocket client = new DatagramSocket();
            String message = "Hello World";
            byte[] bytes = message.getBytes();
            DatagramPacket packet = new DatagramPacket(bytes, bytes.length, InetAddress.getLocalHost(), 5000);
            System.out.println("HI" + packet); 
            System.out.println("Message sent to server");
            client.send(packet);
            client.close();
        } 

        catch (Exception ex) 
        {
                System.err.println(ex);
        } 
    }
}

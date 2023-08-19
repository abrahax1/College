import java.net.*;

public class MyIP 
{
    public static void main(String[] args) 
    {
        try
        {
            InetAddress address = InetAddress.getLocalHost();
            System.out.println(address);
        }
        catch (Exception e)
        {
            System.out.println("IP Address not found");
        }
    }
}

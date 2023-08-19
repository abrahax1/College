import java.net.*;

public class IPSpamCheck 
{
    public static void main(String[] args) throws Exception 
    {
        String IP = "2.0.0.127"; 
        String website = ".sbl.spamhaus.org";
        String query;
        
        try 
        {
            query = IP + website;
            InetAddress.getByName(query);
            System.out.println(IP + " is spam");
        } 
        catch (Exception e) 
        {
            System.out.println(IP + " is not spam");
        }
    }
}

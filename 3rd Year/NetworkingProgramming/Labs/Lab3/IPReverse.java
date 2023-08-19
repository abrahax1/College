import java.net.*;
import java.util.Arrays;
import java.util.Scanner;

public class IPReverse 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter IP address");
        String IP = scan.nextLine(); /*"2.0.0.127"  / 127.0.0.2*/ 
        String[] ArrayedIP = new String[IP.length()];
        String[] ReverseIP = new String[4];

        ArrayedIP = IP.split("\\.");
        System.out.println(Arrays.toString(ArrayedIP));

        int j = 3;
        for (int i = 0; i < 4; i++)
        {
            ReverseIP[j] = ArrayedIP[i];
            j--;
                
        }
        System.out.println(Arrays.toString(ReverseIP));
       
        String website = ".sbl.spamhaus.org";
        String query;
        
        scan.close();

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

import java.rmi.registry.*;

public class Client 
{
    public static void main(String[] args)
    {
        try
        {
            Registry registry = LocateRegistry.getRegistry("localhost");
            Login stub = (Login) registry.lookup("Login");

            int message = stub.verifyLogin("RMI", "DIT");
            System.out.println(message);

            stub.modifyLogin("Abraham", "Izarra");

            String message3 = stub.getPassword();
            System.out.println(message3);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}

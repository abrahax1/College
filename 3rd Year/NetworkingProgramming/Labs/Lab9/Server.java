import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server implements Login
{
    String defaultUsername = "RMI";
    String defaultPassword = "DIT";

    public int verifyLogin(String username, String password) throws RemoteException
    {
        if (username == defaultUsername || password == defaultPassword) 
            return 0;
        else
            return 1;
    }

    public void modifyLogin(String username, String password) throws RemoteException 
    {
        defaultUsername = username;
        defaultPassword = password;
        System.out.println(defaultUsername + ": " + defaultPassword);
    }

    public String getPassword() throws RemoteException 
    {
        return defaultPassword;
    }

    public static void main(String[] args)
    {
        try
        {
            Server obj = new Server();
            Login stub = (Login) UnicastRemoteObject.exportObject(obj, 3002);
            Registry registry = LocateRegistry.getRegistry();
            registry.bind("Login", stub);
            System.out.println("Server is running");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}


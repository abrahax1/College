import java.net.*; 
class ProtocolTest
{
	public static void main(String [] args )
	{
		Protocoltest("http://www.TUDublin.ie");
		Protocoltest("https://www.TUDublin.ie");
		Protocoltest("ftp://TUDublin.ie");
		Protocoltest("mailto:C19340801@mytudublin.ie");
	}

	public static void Protocoltest(String url)
	{
		try 
		{
			URL u = new URL(url);
			System.out.println(u.getProtocol() + " is supported");
		}
		catch (Exception e) 
		{
			System.out.println(url + " is not supported");
		}
	}
}


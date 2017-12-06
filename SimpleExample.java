import java.net.*;
import java.net.UnknownHostException;
class SimpleExample
{
	public static void main (String args[])
	{
		try
		{
			InetAddress addr = InetAddress.getByName("www.google.com");
			System.out.println("Host Name:" + addr.getHostName());
			System.out.println("IP Address:" + addr.getHostAddress());
			System.out.println(addr);
		}
		catch (UnknownHostException e)
		{
			System.out.println("not able to find the corresponding server");
		}
	}
}

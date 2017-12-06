import java.net.InetAddress;
import java.net.UnknownHostException;
public class SimpleExample3
{
	public static void main (String args[]) throws UnknownHostException
	{
		InetAddress addr = InetAddress.getLocalHost();
		System.out.println("IP Address of Localhost:" + addr.getHostAddress());
		System.out.println("Host name is "+ addr.getHostName());
	}
}

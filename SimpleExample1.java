import java.net.InetAddress;
import java.net.UnknownHostException;

class SimpleExample1 {

  public static void main (String args[]) throws UnknownHostException 
	{	
		InetAddress address = InetAddress.getByName("127.0.0.1");
	      	System.out.println(address);
	}
    
  
}


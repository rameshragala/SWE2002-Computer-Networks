import java.net.*;

class SimpleExampleAll {

  public static void main (String args[]) throws UnknownHostException {

      InetAddress[] addresses = InetAddress.getAllByName("www.google.com");
      for (int i = 0; i < addresses.length; i++) {
        System.out.println(addresses[i]);
  }
}
}

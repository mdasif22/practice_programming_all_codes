//******************** URL ******************************
// URL class
/*
import java.net.*;
public class Networking
{
	public static void main(String[] args)throws Exception
	{
		URL ur=new URL("http://www.osborne.com/downloads");
		
		System.out.println("Protocol: " + ur.getProtocol());
		
		System.out.println("Port: " + ur.getPort());
		
		System.out.println("Host: " + ur.getHost());
		
		System.out.println("File: " + ur.getFile());
		
		System.out.println("Ext:" + ur.toExternalForm());
	}
}
*/

// URL connection
/*
import java.net.*;

import java.io.*;

import java.util.Date;

class UCDemo {
	public static void main(String args[]) throws Exception {

		int c;

		URL hp = new URL("http://www.internic.net");

		URLConnection hpCon = hp.openConnection();

		long d = hpCon.getDate();

		if (d == 0) {

			System.out.println("No date information.");
		} else {
			System.out.println("Date : " + new Date(d));
		}

		System.out.println("Content-Type : " + hpCon.getContentType());

		d = hpCon.getExpiration();

		if (d == 0) {
			System.out.println("No expiration information.");
		}

		else {
			System.out.println("Expires : " + new Date(d));
		}

		d = hpCon.getLastModified();

		if (d == 0) {
			System.out.println("No last-modified information.");
		}

		else {
			System.out.println("Last-Modified : " + new Date(d));
		}

		long len = hpCon.getContentLengthLong();

		if (len == -1) {

			System.out.println("Content length unavailable.");
		} else {
			System.out.println("Content - Length : " + len);
		}

		if (len != 0) {
			System.out.println("====== Content ======");

			InputStream input = hpCon.getInputStream();

			while ((c = input.read()) != -1) {
				System.out.print((char) c);
			}

			input.close();

		}

		else {
			System.out.println("NO content unavailable.");
		}
	}
}
*/

// LowPortScanner program
/*
import java.net.*;
import java.io.*;

public class Networking 
{
	public static void main(String[] args) 
	{
		String host = "localhost";
  
		//if (args.length > 0) 
		//{
			//host = args[0];
		//}
  
		
		for (int i = 1; i < 1024; i++) 
		{
			try 
			{
					Socket s = new Socket(host, i);
  
					System.out.println("There is a server on port " + i + " of " + host);
			}
  
			catch(UnknownHostException ex)
			{
					System.err.println(ex);
  
					break;
			}
  
			catch (IOException ex) 
			{
				
			}
		}
  }
} 
*/

//Whois program
/*
import java.net.*;

import java.io.*;

class Networking
{
	public static void main(String args[]) throws Exception 
	{
		int c;

    	Socket s = new Socket("whois.internic.net",43);
    
    	InputStream in = s.getInputStream();
    
    	OutputStream out = s.getOutputStream();

    	String str = (args.length == 0 ? "MHProfessional.com" : args[0]) + "\n";

    	byte buf[] = str.getBytes();
        
    	out.write(buf);

    	while ((c = in.read()) != -1)
    	{
    		System.out.print((char) c);
    	}

    	s.close();
    }
}
*/

//******************************** Datagram ******************************
// Datagram Example Program
/*
import java.net.*;
public class Networking
{
	 public static void main(String[] args)
	 {
		 String s="This is a test";
		 byte[] data=s.getBytes();
		 try
		 {
			 InetAddress ia = InetAddress.getByName("www.ibiblio.org");
			 int port=7;
			 DatagramPacket dp = new DatagramPacket(data,data.length,ia,port);
			 System.out.println("This packet is addressed to "+dp.getAddress()+" on port "+dp.getPort());
			 System.out.println("There are "+dp.getLength()+" bytes of data in this packet");
			 System.out.println(new String(dp.getData(),dp.getOffset(),dp.getLength()));
		 }
		 catch(UnknownHostException e)
		 {
			 System.out.println(e);
		 }
	 }
}
*/


// DatagramPacket program 
/*import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.util.Arrays;
  
public class Networking 
{
    public static void main(String[] args) throws IOException 
    {
  
        byte ar[] = { 12, 13, 15, 16 };
        byte buf[] = { 15, 16, 17, 18, 19 };
        InetAddress ip = InetAddress.getByName("localhost");
          
        // DatagramPacket for sending the data
        DatagramPacket dp1 = new DatagramPacket(ar, 4, ip, 1052);
  
        // setAddress() method
        dp1.setAddress(ip);
  
        // getAddress() method
        System.out.println("Address : " + dp1.getAddress());
          
        // setPort() method
        dp1.setPort(2525);
          
        // getPort() method
        System.out.println("Port : " + dp1.getPort());
          
        // setLength() method
        dp1.setLength(4);
          
        // getLength() method
        System.out.println("Length : " + dp1.getLength());
          
        // setData() method
        dp1.setData(buf);
          
        // getData() method
        System.out.println("Data : " + Arrays.toString(dp1.getData()));
          
        // setSocketAddress() method
        //dp1.setSocketAddress(address.getLocalSocketAddress());
          
        // getSocketAddress() method
        System.out.println("Socket Address : " + dp1.getSocketAddress());
  
        // getOffset() method
        System.out.println("Offset : " + dp1.getOffset());
  
    }
}
*/

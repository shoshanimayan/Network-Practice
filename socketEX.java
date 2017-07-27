import java.net.*;
import java.io.*;
public class socketEX{
	public static void main(String args[]) throws Exception{
		Socket sock = new Socket("whois.internic.net",43);
		InputStream inp = sock.getInputStream();
		OutputStream out= sock.getOutputStream();
		String str= "infiniteskills.com\n";
		byte buffer[]= str.getBytes();
		out.write(buffer);
		int x;
		while((x=inp.read())!=-1){
			System.out.print((char) x);
			
		}
		sock.close();
	
	
	
	
}
}
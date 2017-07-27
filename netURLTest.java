import java.net.*;
import java.io.*;
import java.util.Scanner;
public class netURLTest {
	public static void main(String args[]) throws Exception{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a URL: ");
		String url = scan.next();
		URL theURL= new URL(url);
		System.out.println("basic info:");
		System.out.println("Protocol: "+theURL.getProtocol());
		System.out.println("port: "+theURL.getPort());
		System.out.println("host: "+theURL.getHost());
		
		URLConnection theConnectin=theURL.openConnection();
		int contLen = theConnectin.getContentLength();
		int x;
		if(contLen!=0){
			System.out.println("Content: ");
			InputStream URLinp= theConnectin.getInputStream();
			while((x=URLinp.read())!=-1){
				System.out.print((char) x);
			}
			URLinp.close();
		}
		
		else{
			System.out.println("error: no content");
		}
	}
}
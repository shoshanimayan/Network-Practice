import java.net.*;
import java.io.*;

public class echoServerEX{
	public static void main(String[] args) throws IOException {
	
		ServerSocket sersoc=null;
try{
	sersoc=new ServerSocket(1007);
}		
catch(IOException e){
	System.out.println("cant listen here");
	System.exit(1);
	
}
Socket clientSock=null;
System.out.println("Listening for connection");
try{
	clientSock=sersoc.accept();
}
catch(IOException e){
	System.out.println("fail");
	System.exit(1);
}
System.out.println("connected successfully!");
System.out.println("Listening for input:");
PrintWriter out= new PrintWriter(clientSock.getOutputStream(),true);
BufferedReader inpt= new BufferedReader(new InputStreamReader(
clientSock.getInputStream()));
String inputLine;
	while((inputLine=inpt.readLine())!=null){
		System.out.println("Server: "+inputLine);
		out.println(inputLine);
	if(inputLine.equals("Bye")){break;}}
		out.close();
		inpt.close();
		clientSock.close();
		sersoc.close();
	
	}
}
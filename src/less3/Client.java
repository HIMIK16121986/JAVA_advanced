package less3;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
	
	public static void main(String[] args) {
		try {
			Socket s=new Socket(InetAddress.getByName("172.17.13.171"),3134);			
			Scanner scan = new Scanner(System.in);
			
			while(true) {
			String message=scan.nextLine();			
			s.getOutputStream().write(message.getBytes());
			byte[]buff=new byte[64*1024];
			int r=s.getInputStream().read(buff);
			message=new String(buff,0,r);
			System.out.println(message);
			}
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

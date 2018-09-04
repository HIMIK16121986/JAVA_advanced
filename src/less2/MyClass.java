package less2;

import java.io.Console;

public class MyClass {

	public static void main(String[] args) {
		Console console = System.console();
		if(console==null) {
			System.out.println("WTF???MAcOS???");
			System.exit(66613);
		}
		System.out.println("Console ok...");
		String login=console.readLine();
		char [] pass=console.readPassword();
		String password=new String (pass);
		
		if(login.equals("admin")&&password.equals("1111")) {
			System.out.println("Enter");
		}else{
			System.out.println("NO!");
		}
		
		
	}

}

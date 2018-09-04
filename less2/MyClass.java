package less02;

import java.io.Console;

public class MyClass {

	public static void main(String[] args) {
		Console console = System.console();
		if (console == null) {
			System.out.println("WTF?!MAcOS????");
			System.exit(66613);
		}
		System.out.println("Console ok...");
		String login = console.readLine();
		char[] psw=console.readPassword();
		String password=new String(psw);
		if(login.equals("admin") && password.equals("123")){
			System.out.println("OK");
		}else{
			System.out.println("Go away to AppleStore!");
		}
	}

}

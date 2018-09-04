package less01;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class SomeClass2 {

	public static void main(String[] args) {
		/*
		 * Scanner in = new Scanner(System.in); int user=0; while (true) { if
		 * (in.hasNextInt()) { user = in.nextInt(); break; } else {
		 * System.out.println("Error"); in.next(); } } System.out.println(user);
		 * System.out.println("End");
		 */
//		try {
//			Scanner in = new Scanner(new FileReader("copy_buff_java01.txt"));
//			while (in.hasNext()) {
//				if (in.hasNextInt()) {
//					in.nextInt();
//				} else if (in.hasNextDouble()) {
//					System.out.println(in.nextDouble());
//				}else {
//					in.next();
//				}
//			}
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
		
//		try {
//			Scanner in = new Scanner(new FileReader("copy_buff_java01.txt"));
//			while (in.hasNext()) {
//				if (in.hasNextDouble()) {
//					String number=in.next();
//					//System.out.println(number);
//					try{
//						Integer.parseInt(number);
//					}catch(NumberFormatException e){
//						System.out.println(number);
//					}
//				}else {
//					in.next();
//				}
//			}
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
		
		try {
			Scanner in = new Scanner(new FileReader("copy_buff_java01.txt"));
			in.useDelimiter("a");
			while (in.hasNext()) {
				System.out.println(in.next());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}

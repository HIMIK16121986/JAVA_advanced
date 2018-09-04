package less1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class SomeClass {

	public static void main(String[] args) {
//		FileInputStream fis=null;
//		try {
//			fis=new FileInputStream("putty.exe");
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}finally {
//				try {
//					fis.close();
//					}
//				catch{
//					e.printStackTrace();
//				}
//			
//		}
		try {
			Scanner in = new Scanner(new FileReader("new.txt"));
			
			while(in.hasNext()) {
				if(in.hasNextDouble()) {
					String number=in.next();
					
					try {
					Integer.parseInt(number);
					}catch(NumberFormatException e){
						System.out.println(number);
					}
				}else {
					in.next();
				}
				
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	}

}

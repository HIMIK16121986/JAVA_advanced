package less02;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MyClass2 {

	public static void main(String[] args) {
		Cat cat=new Cat("Susleg",12);
		System.out.println(cat);
		/*
		try(DataOutputStream dos=new DataOutputStream(new FileOutputStream("cat.bin"))){
			dos.writeUTF(cat.getName());
			dos.writeInt(cat.getAge());
			System.out.println("Cat is binary now!");
		}catch(Exception e){
			System.out.println("Opps..something going apple...");
		}
*/
		try(DataInputStream dis=new DataInputStream(new FileInputStream("cat.bin"))){
			Cat c=new Cat(dis.readUTF(),dis.readInt());
			System.out.println("Cat from file: "+c);
			
		}catch(Exception e){
			System.out.println("Opps..something going apple...");
		}
	}

}

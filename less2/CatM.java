package less02;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CatM {

	public static void main(String[] args) {
		Owner owner = new Owner("Yaroslaff");
		Cat cat = new Cat("Vitalina", 21);
		cat.setOwner(owner);
		System.out.println(cat);
		// Write
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		try {
			//FileOutputStream fos = new FileOutputStream("cat2clone.bin");
			ObjectOutputStream oos = new ObjectOutputStream(baos);
			oos.writeObject(cat);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		/*
		 * try { ObjectOutputStream oos=new ObjectOutputStream(baos);
		 * oos.writeObject(cat); } catch (IOException e) { e.printStackTrace();
		 * }
		 */
		// Read
		ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
		try {
			//FileInputStream fis = new FileInputStream("cat2clone.bin");
			ObjectInputStream ois = new ObjectInputStream(bais);
			Cat cloneCat = (Cat) ois.readObject();
			System.out.println(cloneCat);
			System.out.println("Changin owner name");
			owner.setName("Sergio");
			System.out.println(cat);
			System.out.println(cloneCat);
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

		// try {
		// Cat cloneCat=(Cat) cat.clone();
		// owner.setName("Gallina");
		// System.out.println(cloneCat);
		// System.out.println(cat);
		// } catch (CloneNotSupportedException e) {
		// e.printStackTrace();
		// }
	}

}

package in.vikas.fileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerilizationPerson implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1001; //recommanded to give custom UID
	int id;
	String name;

	public static void main(String[] args) throws Exception {

		SerilizationPerson p = new SerilizationPerson();
		p.id = 101;
		p.name = "Vikas";
		

		// Serialization
		System.out.println("====Serialization Started ========");
		FileOutputStream fos = new FileOutputStream("person.ser");

		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(p);

		oos.flush();
		oos.close();
		System.out.println("====Serialization completed========");

		// De-Serialization
		System.out.println("====De-Serialization Started ========");

		FileInputStream fis = new FileInputStream("person.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object object = ois.readObject();

		SerilizationPerson p1 = (SerilizationPerson) object;// type casting narrowing
		System.out.println("Id ::" + p1.id);
		System.out.println("Name ::" + p1.name);

		System.out.println("====De-Serialization completed========");
	}

}/*
====De-Serialization Started ========
Id ::101
Name ::Vikas
====De-Serialization completed========
*/

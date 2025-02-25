package in.vikas.fileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TransientPerson implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1001;
	int id;
	String name;
	String email;
	transient String pwd;

	public static void main(String[] args) throws Exception {

		TransientPerson p = new TransientPerson();
		p.id = 101;
		p.name = "Vikas";
		p.email="pvikas0708@gmail.com";
		p.pwd="vikas0708";

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

		TransientPerson p1 = (TransientPerson) object;// type casting narrowing
		System.out.println("Id ::" + p1.id);
		System.out.println("Name ::" + p1.name);
		System.out.println("Email ::" + p1.email);
		System.out.println("Pwd::" + p1.pwd);
		
		
		System.out.println("====De-Serialization completed========");
	}

}
/*
====Serialization Started ========
====Serialization completed========
====De-Serialization Started ========
Id ::101
Name ::Vikas
Email ::pvikas0708@gmail.com
Pwd::null
====De-Serialization completed========
*/

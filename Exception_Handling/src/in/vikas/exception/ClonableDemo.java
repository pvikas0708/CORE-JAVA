package in.vikas.exception;

public class ClonableDemo implements Cloneable {

	public static void main(String[] args) throws Exception {

		// child object
		ClonableDemo d = new ClonableDemo();

		// storing child obj into parent class reference variable
		Object obj = d; // widening / up casting ( low to high )

		// cloning - getting parent object
		Object object = d.clone();

		// Storing parent object into child class reference variable
		ClonableDemo d1 = (ClonableDemo) object; // narrowing ( high to low )

	}
}

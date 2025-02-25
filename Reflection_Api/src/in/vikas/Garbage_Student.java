package in.vikas;

public class Garbage_Student {

	public static void main(String[] args) {

		// Object created
		Garbage_Student s1 = new Garbage_Student();

		// nullifying (making obj eligible for GC)
		s1 = null; // null value to make object eligible for garbage collection

		System.gc(); //Garbage Collection so that finalize () can be called by Garbage collector 

	}

	protected void finalize() throws Throwable {
		System.out.println("finalize( ) called...");
		// finalize( )=> Called by Garbage Collector on an object when garbage collection determines that there are no more references to the object 
	}

	
}
/*Output:
	finalize( ) called...
*/
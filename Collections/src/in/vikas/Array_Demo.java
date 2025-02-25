package in.vikas;

import java.util.ArrayList;

public class Array_Demo {

	public static void main(String[] args) {
		ArrayList al = new ArrayList(); // default capacity of Array is 10

		al.add(100);
		al.add(50.00);
		al.add("Vikas");
		al.add('A');
		al.add(true);

		System.out.println(al);
		System.out.println("Size before removal::" + al.size());
		al.remove(0);
		System.out.println("Size after removal::" + al.size());
	}
}
/*Output:
	[100, 50.0, Vikas, A, true]
			Size before removal::5
			Size after removal::4
*/
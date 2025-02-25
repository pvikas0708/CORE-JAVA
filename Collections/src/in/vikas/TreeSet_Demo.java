package in.vikas;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_Demo {

	public static void main(String[] args) {

		TreeSet ts = new TreeSet<>();

		ts.add(13);
		ts.add(7);
		ts.add(9);
		// ts.add("hi"); doesnot allowed heterogenous data because treeset follows
		// natural sorting order all objects must belong in same data type otherwise it
		// will give cast class exception=> natural sorting 0-10 & A-Z
		ts.add(1);
		ts.add(3);

		System.out.println(ts); // maintains sorted order

		Iterator iterator = ts.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		TreeSet ts1 = new TreeSet<>();

		ts1.add("Vikas");
		ts1.add("Pooja");
		ts1.add("Balaji");
		ts1.add("Pooja");// duplicate not allowed

				
		System.out.println(ts1); // sorting from A to Z

		Iterator iterator2 = ts1.iterator();
		while (iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}

	}
}

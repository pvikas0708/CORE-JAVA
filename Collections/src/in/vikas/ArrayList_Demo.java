package in.vikas;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Demo {

	public static void main(String[] args) {

		List l = new ArrayList();

		l.add(100);
		l.add(200);
		l.add(300);
		l.add(400);
		l.add(100);
		l.add(1000);
		l.add(null);

		System.out.println(l);

		l.remove(0);
		System.out.println(l);

		System.out.println(l.size()); // total size of objects in collection

		l.add(0, 500); // not recommanded due to performnance issue (lot of shifting)
		System.out.println(l);

		l.add(3, 700);
		System.out.println(l);

		l.set(0, 50);// just replace no shifting
		System.out.println(l);

		System.err.println(l.contains(700));// to check presence of object

		System.out.println(l.get(0));// gives object available in given index

		// System.out.println(l.get(100));// AIOBE => 100th index does not exist

		System.out.println(l.indexOf(100)); // to get index number of given object

		System.out.println(l.lastIndexOf(100)); // gives last occerunce of object

		System.out.println(l.indexOf(444)); // if object does not exist it will give -1

		List l2 = new ArrayList();

		l2.add(100);
		l2.add(500);
		l2.add(600);

		l2.addAll(0, l);

		System.out.println(l2);

		System.out.println(l2.retainAll(l)); // removes all objects which are not contain in specific collection
		// Objects of l will be keep and object of l2 will be removed form list
	}
}
/*Output:
	[100, 200, 300, 400, 100, 1000, null]
			[200, 300, 400, 100, 1000, null]
			6
			[500, 200, 300, 400, 100, 1000, null]
			[500, 200, 300, 700, 400, 100, 1000, null]
			[50, 200, 300, 700, 400, 100, 1000, null]
			50
			true
			5
			5
			-1
			[50, 200, 300, 700, 400, 100, 1000, null, 400, 100]
			false
 */

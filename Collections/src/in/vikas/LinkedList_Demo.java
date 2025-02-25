package in.vikas;

import java.util.LinkedList;

public class LinkedList_Demo {

	public static void main(String[] args) {

		LinkedList<Integer> ll = new LinkedList<Integer>();

		ll.add(10); // 1 node
		ll.add(20); // 1 node
		ll.add(30); // 1 node
		ll.add(40); // 1 node

		System.out.println(ll);

		System.out.println(ll.get(0)); // gives 1st node data=>10

		ll.add(1, 15);
		System.out.println(ll);// replacing value of 1st index

		System.out.println(ll.getLast()); // for last value
	}
}
/*Output:
	[10, 20, 30, 40]
			10
			[10, 15, 20, 30, 40]
			40
*/
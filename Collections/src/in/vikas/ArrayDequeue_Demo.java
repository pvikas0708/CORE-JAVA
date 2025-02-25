package in.vikas;

import java.util.ArrayDeque;

public class ArrayDequeue_Demo {

	public static void main(String[] args) {

		ArrayDeque<String> ad = new ArrayDeque<>();

		ad.add("one");
		ad.add("two");
		ad.add("three");
		ad.addFirst("vikas");

		//with ArrayDequeue insertion and Removal can be done from both side
		System.out.println(ad);

		ad.pollFirst();////Retrieves and removes the first element of this deque,or returns null if this deque is empty.
		System.out.println(ad);		

		ad.pollLast();//Retrieves and removes the last element of this deque,or returns null if this deque is empty.
		System.out.println(ad);
	}

}
/*Output:
	[vikas, one, two, three]
			[one, two, three]
			[one, two]
*/
	

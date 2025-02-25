package in.vikas;

import java.util.HashSet;

public class HashSet_Demo {

	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<String>();
		hs.add("one");
		hs.add("two");
		hs.add("three");
		boolean add = hs.add("four");// If object is not available it returns true if available it returns false
		hs.add("five");
		hs.add("one"); // Duplicates are not Allowed
		hs.add(null);
		
		System.out.println(hs); // insertion order does not maintain

		hs.remove("three"); //removes three
		System.out.println(hs);

	}
}
/*Output:
	[null, four, one, two, three, five]
			[null, four, one, two, five]
*/

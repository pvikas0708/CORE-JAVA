package in.vikas;

import java.util.LinkedHashSet;

public class LinkedHasSet_Demo {

	public static void main(String[] args) {

		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();

		lhs.add(10);
		lhs.add(20);
		lhs.add(30);
		lhs.add(null);
		lhs.add(40);
		lhs.add(20); // duplicate are not allowed
		System.out.println(lhs); // insertion order is maintained

	}
}
//Output:[10, 20, 30, null, 40]

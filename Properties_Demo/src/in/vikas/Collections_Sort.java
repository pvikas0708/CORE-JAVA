package in.vikas;

import java.util.ArrayList;
import java.util.Collections;

public class Collections_Sort {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();

		al.add(5);
		al.add(3);
		al.add(4);
		al.add(1);
		al.add(2);

		System.out.println("Before Sort : " + al);

		// Sort the collection
		Collections.sort(al);

		System.out.println("After Sort : " + al);

		// Reverse the collection
		Collections.reverse(al);

		System.out.println("After Reverse : " + al);
	}

}

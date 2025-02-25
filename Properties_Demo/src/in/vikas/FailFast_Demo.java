package in.vikas;

import java.util.ArrayList;

public class FailFast_Demo {

	public static void main(String[] args) {

		// Fail Fast Collection
		ArrayList<Integer> al = new ArrayList<>();

		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);

		for (int i : al) {
			System.out.println(i);
			if (i == 100) {
				al.add(150);
			}
		}
	}

}
//Output: 100 & Exception in thread "main" java.util.ConcurrentModificationException

package in.vikas;

import java.util.concurrent.CopyOnWriteArrayList;

public class Fail_Safe_Demo2 {

	public static void main(String[] args) {

		// Fail Safe Collection
		CopyOnWriteArrayList<Integer> al = new CopyOnWriteArrayList<>();

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
		System.out.println(al);
	}

}
/*Output:
	100
	200
	300
	400
	[100, 200, 300, 400, 150]
*/
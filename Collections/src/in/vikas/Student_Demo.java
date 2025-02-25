package in.vikas;

import java.util.ArrayList;

public class Student_Demo {

	public static void main(String[] args) {

		// Type-Safety
		ArrayList<Student> al = new ArrayList();

		al.add(new Student(101, "vikas"));
		al.add(new Student(102, "Balaji"));
		al.add(new Student(103, "Pooja"));
		al.add(new Student(104, "Juhee"));
		al.add(new Student(105, "Shreyas"));

		System.out.println("=================Forward direction Array List=================");
		// to print from 1st to last
		for (Student s : al) {
			System.out.println(s); // gives toString representation of object we have to override this method in
									// Student class (we have to override toString () method)
		}

		System.out.println("=================Backward direction Array List=================");
		// to print from last to 1st
		for (int i = al.size() - 1; i >= 0; i--) {
			System.out.println(al.get(i));
		}
	}
}
/*Output:
	=================Forward direction Array List=================
	101- vikas
	102- Balaji
	103- Pooja
	104- Juhee
	105- Shreyas
	=================Backward direction Array List=================
	105- Shreyas
	104- Juhee
	103- Pooja
	102- Balaji
	101- vikas
*/

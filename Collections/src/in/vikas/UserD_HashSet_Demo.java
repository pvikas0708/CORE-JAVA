package in.vikas;

import java.util.HashSet;
import java.util.Iterator;

public class UserD_HashSet_Demo {

	public static void main(String[] args) {

		HashSet<Student> hs = new HashSet<Student>();
		hs.add(new Student(101, "vikas"));
		hs.add(new Student(102, "Balaji"));
		hs.add(new Student(103, "Pooja"));
		hs.add(new Student(104, "Shreyas"));
		hs.add(new Student(105, "Juhee"));

		Iterator<Student> iterator = hs.iterator();// insertion order is not maintained
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
/*Output:
	104- Shreyas
	105- Juhee
	101- vikas
	102- Balaji
	103- Pooja
*/
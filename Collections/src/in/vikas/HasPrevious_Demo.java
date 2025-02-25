package in.vikas;

import java.util.ArrayList;
import java.util.ListIterator;

public class HasPrevious_Demo {

	public static void main(String[] args) {

		ArrayList<Student> al = new ArrayList<Student>();

		al.add(new Student(101, "vikas"));
		al.add(new Student(102, "Balaji"));
		al.add(new Student(103, "Pooja"));
		al.add(new Student(104, "Juhee"));
		al.add(new Student(105, "Shreyas"));

		ListIterator<Student> li = al.listIterator();
		while (li.hasPrevious()) {
			System.out.println(li.hasPrevious());
		}
	}
}
//Output: blank console because hasnext () method will always point to 0th ndex and no object present before 0th index

package in.vikas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student_demo {

	public static void main(String[] args) {

		List<Student> al = new ArrayList<>();

		al.add(new Student(101, "John", 3));
		al.add(new Student(104, "Anil", 4));
		al.add(new Student(102, "Smith", 2));
		al.add(new Student(103, "Robert", 1));

		//Collections.sort(al); not applicable user defined class (Student) must impl Comparable 

		Collections.sort((List<Student>) al);
		
		for (Student s : al) {
			System.out.println(s);
		}

	}

}

//Note: Comparable interface will allow us to sort the data based on only one value. If we want to change our sorting technique then we need to modify the class which is implementing Comparable interface. Modifying the code everytime is not recommended.


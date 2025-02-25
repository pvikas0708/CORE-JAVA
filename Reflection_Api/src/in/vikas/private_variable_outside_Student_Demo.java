package in.vikas;

import java.lang.reflect.Field;

public class private_variable_outside_Student_Demo {

	public static void main(String[] args) throws Exception {

		// loading class into jvm
		Class clz = Class.forName("in.vikas.private_variable_outside_Student");

		// creating object for the loaded class
		Object obj = clz.newInstance();

		// getting the filed whose name is age
		Field field = clz.getDeclaredField("age");

		// making variable accessible outside of the class
		field.setAccessible(true);

		// set value to field
		field.set(obj, 35);

		private_variable_outside_Student s = (private_variable_outside_Student) obj;
		s.getAge();

	}

}
/*
Output:
	Age : 35
*/
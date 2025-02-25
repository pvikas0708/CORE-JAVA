package in.vikas;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Student_Demo {

	public static void main(String[] args) throws Exception {

		// ======================getting-Variables-Available-in-Class================
		Class clz = Class.forName("in.vikas.Student");

		Field[] fields = clz.getDeclaredFields();

		for (Field f : fields) {
			System.out.println(f.getName());
		}
		// ======================getting-Methods-Available-in-Class=================
		Method[] methods = clz.getDeclaredMethods();
		for (Method m : methods) {
			System.out.println(m.getName());
		}
		// ======================getting-Constructors-Available-in-Class==============
		Constructor[] constructors = clz.getDeclaredConstructors();
		for (Constructor c : constructors) {
			System.out.println(c.getName());
		}
	}
}
/*Output:
	id
	name
	m2
	m1
	display
	in.vikas.Student
*/
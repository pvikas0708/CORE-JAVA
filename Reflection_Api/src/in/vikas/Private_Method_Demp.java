package in.vikas;

import java.lang.reflect.Field;

public class Private_Method_Demp {

	public static void main(String[] args) throws Exception {

		// loading class into jvm
		Class clz = Class.forName("in.vikas.Private_Method");

		// creating object for the loaded class
		Object obj = clz.newInstance();

		// getting the filed whose name is age
		Field field = clz.getDeclaredField("age");

		// making variable accessible outside of the class
		field.setAccessible(true);

		// set value to field
		field.set(obj, 25);

		Private_Method s = (Private_Method) obj;
		s.getAge();

	}

}
/*Output:
	Age : 25
*/
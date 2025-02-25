package in.vikas;

public class Student {

	String name;
	String email;
	Long phno;
	static String institute;

	public static void main(String[] args) {

		Student.institute = "vikasit";

		Student ankit = new Student();
		ankit.name = "Ankit";
		System.out.println(ankit.name);

		Student gautam = new Student();
		gautam.name = "Gautam";
		System.out.println(gautam.name);
	}
}

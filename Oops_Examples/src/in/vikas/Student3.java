package in.vikas;

public class Student3 {
	int id;
	String name;
	int age;
	String gender;

	public Student3(int id, String name, int age, String gender) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		System.out.println(this.id + "-" + this.name + "-" + this.age + "-" + this.gender);
	}

	public static void main(String[] args) {
		Student3 s1 = new Student3(1, "Raju", 20, "Male");
		Student3 s2 = new Student3(1, "Rani", 22, "FeMale");
	}

}

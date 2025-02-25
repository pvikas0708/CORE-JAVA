package in.vikas;

class Person {
	int id;
	String name;
	int age;

}

class Driver7 {

	public static void main(String[] args) {
		Driver7 d = new Driver7();// obj creation
		Person2 p = new Person2();// obj creation

		p.id = 201;
		p.name = "John";
		p.age = 30;

		d.print(p);
	}

	void print(Person2 p) {
		System.out.println(p.id + " " + p.name + " " + p.age);

	}
}
//Output:201 John 30

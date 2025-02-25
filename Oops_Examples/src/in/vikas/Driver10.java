package in.vikas;

public class Driver10 {

	public static void main(String[] args) {

		Driver10 d = new Driver10();
		Person2 person = d.getPerson(101);

		System.out.println(person.id + " " + person.name + " " + person.age);
	}

	Person2 getPerson(int id) {
		Person2 p = new Person2();
		if (id == 101) {
			p.id = 101;
			p.name = "Raju";
			p.age = 30;
		} else if (id == 102) {
			p.id = 102;
			p.name = "Rani";
			p.age = 28;

		}
		return p;

	}
}

class Person2 {
	int id;
	String name;
	int age;
}
//Output:101 Raju 30

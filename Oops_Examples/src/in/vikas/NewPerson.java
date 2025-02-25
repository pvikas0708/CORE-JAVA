package in.vikas;

public class NewPerson {

	int id;
	String name;

	void m1(NewPerson p1, NewPerson p2) {
		System.out.println(p1.id + " " + p1.name);
		System.out.println(p2.id + " " + p2.name);
	}

	NewPerson[] m2() {
		NewPerson p1 = new NewPerson();
		p1.id = 103;
		p1.name = "Balaji";

		NewPerson p2 = new NewPerson();
		p2.id = 104;
		p2.name = "Pooja";

		NewPerson p3 = new NewPerson();
		p3.id = 105;
		p3.name = "Juhee";

		NewPerson[] arr = { p1, p2, p3 };//creating person array

		return arr;
	}

	public static void main(String[] args) {
		NewPerson p = new NewPerson();

		NewPerson p1 = new NewPerson();
		p1.id = 101;
		p1.name = "Raju";

		NewPerson p2 = new NewPerson();
		p2.id = 102;
		p2.name = "Rani";

		// p.m1(p1, p2);
		// p.m1(p1, p2);
		p2.m1(p1, p2);

		NewPerson[] per = p.m2();

		for (NewPerson person : per) {//printing Array
			System.out.println(person.id + " " + person.name);
		}

		System.out.println(per);
	}

}
/*101 Raju
102 Rani
103 Balaji
104 Pooja
105 Juhee
[Lin.vikas.NewPerson;@72ea2f77*/

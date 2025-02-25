package in.vikas;

public class Driver8 {

	public static void main(String[] args) {

		Driver8 d = new Driver8();
		Person1 per = d.getPerson();

		System.out.println(per.pId + " " + per.pName + " " + per.pAge);

	}

	Person1 getPerson() {
		Person1 p = new Person1();
		p.pId = 101;
		p.pName = "Anne-Marie";
		p.pAge = 30;
		return p;
	}
}

class Person1 {
	int pId;
	String pName;
	int pAge;
}
//Output:101 Anne-Marie 30

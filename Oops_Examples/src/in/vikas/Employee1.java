package in.vikas;

public class Employee1 {

	int id;
	String name;
	Double salary;

	// 0-Param Constructor
	public Employee1() {
		// TODO Auto-generated constructor stub
	}

	// 1-Param Constructor
	public Employee1(String name) {
		this.name = name;
		System.out.println(this.name);
	}

	// 2-Param Constructor
	public Employee1(int id, String name) {
		this.id = id;
		this.name = name;

		System.out.println(this.id + " " + this.name);
	}

	// 3-Param Constructor
	public Employee1(int id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		System.out.println(this.id + " " + this.name + " " + this.salary);
	}

	public static void main(String[] args) {
		Employee1 e = new Employee1();
		Employee1 e1 = new Employee1("vikas");
		Employee1 e2 = new Employee1(101, "Vikas");
		Employee1 e3 = new Employee1(102, "Balaji", 550000.00);

	}

}
/*
vikas
101 Vikas
102 Balaji 550000.0
*/

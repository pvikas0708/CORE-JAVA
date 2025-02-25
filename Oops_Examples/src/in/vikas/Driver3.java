package in.vikas;

public class Driver3 {

	public static void main(String[] args) {
		Driver3 d = new Driver3();

		Employee1 e = new Employee1();
		e.id = 101;
		e.salary = 15000.0;

		d.print(e);
	}

	void print(Employee1 e) {
		System.out.println(e.id + "--" + e.salary);
	}
}

class Employee {

	int id;
	Double salary;

}

//Output: 101--15000.0

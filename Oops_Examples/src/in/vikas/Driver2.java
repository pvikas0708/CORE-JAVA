package in.vikas;

public class Driver2 {

	public static void main(String[] args) {
		Driver2 d=new Driver2();
		Student_Driver s = new Student_Driver();
		s.id = 101;
		s.name = "Raju";		
		d.print(s);

		
		
	}
	void print(Student_Driver s)
	{
		System.out.println(s.id + " " + s.name);

	}
}

class Student_Driver {
	int id;
	String name;
}
//Output:101 Raju 
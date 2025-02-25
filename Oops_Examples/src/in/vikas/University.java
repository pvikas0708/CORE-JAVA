package in.vikas;

public class University {

	int id;
	String name;

	static University getUniversity(int id) {
		University u = new University();
		if (id == 101) {
			u.id = 101;
			u.name = "Oxford";
		} else if (id == 102) {
			u.id = 102;
			u.name = "Standford";
		}
		return u;

	}

	public static void main(String[] args) {

		University university = getUniversity(101); // because getUniversity is static() method
		// University university = u.getUniversity(101);

		System.out.println(university.id + " " + university.name);
	}
}
//Output:101 Oxford

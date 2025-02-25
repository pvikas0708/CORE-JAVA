package in.vikas;

public class Driver9 {

	public static void main(String[] args) {

		Driver9 d = new Driver9();
		College clg = d.getCollege();

		System.out.println(clg.cId + " " + clg.cName);
	}

	College getCollege() {
		College c = new College();
		c.cId = 101;
		c.cName = "COEP";

		return c;

	}
}

class College {
	int cId;
	String cName;

}
//Output:101 COEP

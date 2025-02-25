package in.vikas;

public class Driver5 {

	public static void main(String[] args) {

		Driver5 dr = new Driver5();
		Doctor d = new Doctor();
		d.doctorName = "vikas";
		d.doctortAge = 30;

		dr.print(d);

	}

	void print(Doctor d) {
		System.out.println(d.doctorName + " " + d.doctortAge);
	}

}

class Doctor {
	String doctorName;
	int doctortAge;

}
//Output: vikas 30

package in.vikas;

public class GenericsDemo {

	public void m1(Integer args) {
		System.out.println("Param Recieved : " + args);
	}

	public static void main(String[] args) throws Exception {
		GenericsDemo d = new GenericsDemo();

		d.m1(10); // passing int value
		// d.m1("hi"); // passing String value => not allowed
		// d.m1(100.51); // passing double value => not allowed
		// d.m1(true); // passing boolean value => not allowed
	}

}
/*Output:
	Param Recieved : 10
*/
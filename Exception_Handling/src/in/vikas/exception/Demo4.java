package in.vikas.exception;

public class Demo4 {

	void m1(int a, int b) {
		System.out.println("m1 started");

		try {
			int c = a / b;
			System.out.println(c);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("m1 ended..!");
	}

	public static void main(String... args) {
		System.out.println("main method started..!");
		Demo4 d = new Demo4();
		d.m1(10, 2);
		System.out.println("main method ended...!");
	}

}
/*m1 started
5
m1 ended..!
main method ended...!
*/
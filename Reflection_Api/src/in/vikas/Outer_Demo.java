package in.vikas;

public class Outer_Demo {

	void outerMethod() {
		Inner i = new Inner();
		i.innerMethod();
	}

	public static void main(String[] args) {
		Outer_Demo o = new Outer_Demo();
		o.outerMethod();
	}

	private class Inner {
		void innerMethod() {
			System.out.println("inner method called...");
		}
	}

}
/*Output:
	inner method called...
*/
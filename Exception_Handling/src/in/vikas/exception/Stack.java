package in.vikas.exception;

public class Stack {

	void m1() {
		System.out.println("M1 method..!");
		m2();
	}

	void m2() {
		System.out.println("M1 method..!");
		m1();
	}

	public static void main(String[] args) {
		System.out.println("main ( ) method - start");
		Stack s = new Stack();
		s.m1();
		
		System.out.println("main( ) method - end");
	}
}

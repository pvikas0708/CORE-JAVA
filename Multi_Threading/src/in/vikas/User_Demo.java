package in.vikas;

public class User_Demo extends Thread {

	public void run() {
		System.out.println("My method started");

		m1();

		System.out.println("My method completed");
	}

	public void m1() {
		System.out.println("I am from m1() method");
	}

	public static void main(String[] args) {
		Thread currentThread = Thread.currentThread();
		String name = currentThread.getName();

		System.out.println(name + "-thread started..!");

		User_Demo d = new User_Demo();
		// d.m1();

		Thread t = new Thread(d);
		t.start(); // internally it will call run() method

		System.out.println(name + "-thread completed..!");
	}
}
/*
main-thread started..!
My method started
main-thread completed..!
I am from m1() method
My method completed
*/
package in.vikas;

public class UserDefindThread extends Thread {

	public void run() {
		System.out.println("My thread started..!");
		System.out.println("I am from run() method");
		System.out.println("My thread ended..!");
	}

	public static void main(String[] args) {

		System.out.println("Main thread started..!");
		UserDefindThread d = new UserDefindThread();

		Thread t = new Thread(d);// making our class obj association with thread
		t.start();// thread will start () whenever we call start method thread will look for run() method

		System.out.println("Main thread completed..!");
	}
}
/*
Main thread started..!
Main thread completed..!
My thread started..!
I am from run() method
My thread ended..!
*/
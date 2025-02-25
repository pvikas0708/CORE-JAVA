package in.vikas;

public class Demo {

	public static void main(String... args) {

		System.out.println("hello vikas");

		Thread currentThread = Thread.currentThread(); // getting current thread
		System.out.println(currentThread);// toString () calling
		System.out.println(currentThread.getName()); // main

	}
}
/*hello vikas
Thread[main,5,main]
main*/
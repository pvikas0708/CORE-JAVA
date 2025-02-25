package in.vikas;

public class Runnable_Demo2 implements Runnable {

	public void run() {
		System.out.println("run () method started...");

		Thread t = Thread.currentThread();
		System.out.println(t.getName());

		System.out.println("run () method ended...");
	}

	public static void main(String... args) {
		Runnable_Demo2 d = new Runnable_Demo2();

		Thread t = new Thread(d);
		//t.start();
		 t.run();
	}

}
/*Output:
	run () method started...
	Thread-0
	run () method ended...
	
	And 
	run () method started...
main
run () method ended...

*/

package in.vikas;

public class Thread_Sleep_Demo implements Runnable {

	public void run() {
		System.out.println("run () method started...");

		try {
			Thread.sleep(5000); // blocked state(mili sec)
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("run () method ended...");
	}

	public static void main(String... args) {
		Thread_Sleep_Demo d = new Thread_Sleep_Demo();

		Thread t = new Thread(d); // new state
		t.start(); // runnable state
	}

}
/*Output:
	run () method started...
	run () method ended...
*/
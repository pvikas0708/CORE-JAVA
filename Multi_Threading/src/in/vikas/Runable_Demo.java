package in.vikas;

public class Runable_Demo implements Runnable {

	public void run() {
		System.out.println("run () method called...");
	}

	public static void main(String... args) {

		Runable_Demo d = new Runable_Demo();

		Thread t = new Thread(d);
		t.start();
	}

}

//run () method called...

package in.vikas;

public class DaemonThread implements Runnable {

	@Override
	public void run() {

		if (Thread.currentThread().isDaemon()) {
			System.out.println("Daemon Thread Executed...");
		} else {
			System.out.println("Normal Thread Executed...");
		}

	}

	public static void main(String[] args) {
		DaemonThread d = new DaemonThread();
		Thread t1 = new Thread(d);
		t1.setDaemon(true); // background thread
		t1.start();
	}

}

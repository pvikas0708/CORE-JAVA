package in.vikas;

public class SynchDemo implements Runnable {

	public synchronized void printNums() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName() + "=> " + i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void run() {
		printNums();
	}

	public static void main(String[] args) {
		SynchDemo d = new SynchDemo();

		Thread t1 = new Thread(d);
		t1.setName("Thread-1");
		t1.start();

		Thread t2 = new Thread(d);
		t2.setName("Thread-2");
		t2.start();
	}

}

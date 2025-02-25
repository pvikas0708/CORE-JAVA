package in.vikas;

public class JoinMethodDemo {

	public static void main(String[] args) throws Exception {

		Thread t1 = new Thread() {
			public void run() {
				for (int i = 1; i <= 5; i++) {
					System.out.println(Thread.currentThread().getName() + " => " + i);
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		t1.setName("Thread-1");

		Thread t2 = new Thread() {
			public void run() {
				for (int i = 1; i <= 5; i++) {
					System.out.println(Thread.currentThread().getName() + " => " + i);
					try {
						Thread.sleep(100); // to stop execution of thread for given amount of time.s
						Thread.yield(); //yield () method gives chance to other method to execute parallely
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		t2.setName("Thread-2");

		t1.start();
		t1.join(); // After completion of first thread then only second thread should get chance to execute
		t2.start();

	}
}

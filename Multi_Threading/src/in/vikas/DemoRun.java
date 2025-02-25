package in.vikas;

public class DemoRun implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {

		DemoRun d = new DemoRun();

		Thread t = new Thread(d);

		t.start();
	}
}

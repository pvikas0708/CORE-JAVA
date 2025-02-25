package in.vikas;

public class Illegal_Thread_Demo implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String... args) {
		Illegal_Thread_Demo d = new Illegal_Thread_Demo();

		Thread t1 = new Thread(d);

		t1.start();
		
	}

	

}


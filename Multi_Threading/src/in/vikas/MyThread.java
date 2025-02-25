package in.vikas;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyThread {

	public static void main(String[] args) {

		Thread t1 = new Thread() {// Anonymous Implementation({})
			public void run() {
				System.out.println("run ( ) method logic-1");
			}
		};

		t1.start();

		Runnable r = new Runnable() {
			@Override
			public void run() {
				System.out.println("run method() logic-2");
			}
		};

		Thread t2 = new Thread(r);
		t2.start();

		Callable c = new Callable() {
			public Object call() throws Exception {
				System.out.println("call( ) method logic - 3");
				return null;
			}
		};

		ExecutorService exService = Executors.newFixedThreadPool(1);
		exService.submit(c);
	}

}
/*Output:
	run ( ) method logic-1
	run method() logic-2
	call( ) method logic - 3
*/
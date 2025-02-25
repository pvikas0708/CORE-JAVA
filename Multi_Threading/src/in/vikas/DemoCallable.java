package in.vikas;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class DemoCallable implements Callable {

	@Override
	public Object call() throws Exception {
		System.out.println("Call () - method executed..!");
		return "Hi..!";
	}

	public static void main(String[] args) throws Exception {

		DemoCallable d = new DemoCallable();
		// Thread t = new Thread(d); Thread will not accept runnable interface object

		ExecutorService exservice = Executors.newFixedThreadPool(10);// no of threads creation(Executors introduced in
																		// java 1.5v)

		for (int i = 1; i <= 15; i++) {
			Future submit=  exservice.submit(d);// submitting task to thread pool
			// 1st 5 threads will work in round-robin passion beacuse we have created pool of 10
			
			System.out.println(submit.get().toString());
		}

		exservice.shutdown();
	}
}
/*Output: Call () - method executed..!
Hi..!(printing it 15 times)*/

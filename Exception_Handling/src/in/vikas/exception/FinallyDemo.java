package in.vikas.exception;

public class FinallyDemo {

	public static void main(String[] args) {
		System.out.println("main( ) method started...");
		try {
			System.out.println("try block - start");
			int i = 10 / 2;
			System.out.println("try block - end");
		} catch (Exception e) {
			System.out.println("catch block");
			e.printStackTrace();
		} finally {
			System.out.println("finally - block");
		}
		System.out.println("main( ) method ended...");
	}

}
/*Output:
	try block - start
	try block - end
	finally - block
	main( ) method ended...
*/
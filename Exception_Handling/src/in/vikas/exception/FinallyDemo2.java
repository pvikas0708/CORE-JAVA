package in.vikas.exception;

public class FinallyDemo2 {

	public static void main(String[] args) {
		System.out.println("main( ) method started...");
		try {
			System.out.println("try block - start");
			int i = 10 / 0;
			System.out.println("try block - end");
		} finally {
			System.out.println("finally - block");
		}
		System.out.println("main( ) method ended...");
	}

}

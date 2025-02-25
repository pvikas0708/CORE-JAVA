package in.vikas;

public class Factorial {

	public static void main(String[] args) {

		int factorial = 1; // dont take factorial=0

		for (int i = 1; i <= 5; i++) {
			factorial = factorial * i;
		}
		System.out.println(factorial);
	}
}
//Output:120
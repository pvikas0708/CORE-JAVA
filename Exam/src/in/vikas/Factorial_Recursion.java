package in.vikas;

public class Factorial_Recursion {

	// n=5*4*3*2*1
	static int factorial(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}

	}

	public static void main(String[] args) {
		System.out.println(factorial(5));
	}
}

//Output:120
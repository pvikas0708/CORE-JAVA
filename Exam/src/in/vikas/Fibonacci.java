package in.vikas;

public class Fibonacci {

	public static void main(String[] args) {

		int firstNum = 0;
		int secondNum = 1;
		int thirdNum = 0;
		for (int i = 0; i <= 5; i++) {
			System.out.print(firstNum);
			thirdNum = firstNum + secondNum;

			firstNum = secondNum;
			secondNum = thirdNum;
		}
	}
}
//Output:011235
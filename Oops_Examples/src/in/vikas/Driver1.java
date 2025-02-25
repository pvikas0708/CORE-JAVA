package in.vikas;

import java.util.Arrays;

public class Driver1 {

	public static void main(String[] args) {

		Driver1 d = new Driver1();
		int[] arr = { 10, 20, 30, 40, 50 };
		d.print(arr);

	}

	void print(int[] arr) {
		String str = Arrays.toString(arr); // toString returns String
		System.out.println(str);
	}

}

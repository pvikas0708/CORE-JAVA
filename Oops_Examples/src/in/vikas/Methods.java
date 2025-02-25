package in.vikas;

import java.util.Arrays;

public class Methods {

	public static void main(String[] args) {

		// object creation
		Methods m = new Methods();

		int[] ar = { 1, 2, 3, 4, 5 };

		m.print(ar);
		m.fullname("vikas", "-patil");

	}

	void print(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}

	void fullname(String fname, String lname) {
		String name = fname + lname;
		System.out.println(name);
	}
}

//Output: [1, 2, 3, 4, 5] & vikas-patil

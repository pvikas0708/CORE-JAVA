package in.array;

import java.util.Arrays;

public class Printing_Array {

	public static void main(String[] args) {
		int[] arr = { 15, 8, 9, 2, 11, 4 };

		// First Way
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
		System.out.println();
		// Second Way=> For each loop
		for (int x : arr) {
			System.out.print(x + ",");
		}
		// Third Way=> toString
		System.out.println("\n" + Arrays.toString(arr));
	}
}

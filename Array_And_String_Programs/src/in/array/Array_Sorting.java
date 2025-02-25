package in.array;

import java.util.Arrays;

public class Array_Sorting {

	public static void main(String[] args) {
		int[] arr = { 15, 17, 18, 16, 14, 15, 12, 03, 14, 21, 11, 12 };
		System.out.println("Array Before Sorting");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
		Arrays.sort(arr);
		System.out.println("\n\nArray After Sorting");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
	}
}

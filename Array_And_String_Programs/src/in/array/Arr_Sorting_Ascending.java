package in.array;

import java.util.Arrays;

public class Arr_Sorting_Ascending {

	public static void main(String[] args) {
		int[] arr = { 15, 8, 9, 2, 11, 4 };

		int temp = 0; //

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				System.out.println(Arrays.toString(arr)); // for iteration
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
//[2, 4, 8, 9, 11, 15]
package in.array;

import java.util.Arrays;

public class Array_Segragation_0_1_And_2 {

	public static void main(String[] args) {
		int arr[] = { 0, 1, 2, 0, 1, 2 };

		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
//[0, 0, 1, 1, 2, 2]
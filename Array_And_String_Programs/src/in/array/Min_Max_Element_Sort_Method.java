package in.array;

import java.util.Arrays;

public class Min_Max_Element_Sort_Method {

	public static void main(String[] args) {
		int[] arr = { 15, 19, 18, 27, 12, 16, 10, 13, 14, 24, 52, 63, 25, 52 };

		Arrays.sort(arr);
		System.out.println("Max Element ::" + arr[0]);
		System.out.println("MIN Element ::" + arr[arr.length - 1]);

	}
}

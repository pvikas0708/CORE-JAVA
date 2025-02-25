package in.array;

import java.util.Arrays;

public class Arr_Multi_Retrivival {

	public static void main(String[] args) {
		// to get data & retrieving Multi Dim Arr

		int[][] arr = new int[2][2];

		arr[0][0] = 100;
		arr[0][1] = 200;
		arr[1][0] = 300;
		arr[1][1] = 400;

		for (int[] ar : arr) {
			System.out.println(Arrays.toString(ar));
		}
	}
}
/* Array last index size => arr.length-1
[100, 200]
[300, 400]
*/
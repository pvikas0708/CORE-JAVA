package in.array;

import java.util.Arrays;

public class Arr_MulDim {

	public static void main(String[] args) {
		int[][] arr = { { 100, 200 }, { 300, 400 }, { 500, 600 } };
		for (int[] ar : arr) {
			System.out.println(Arrays.toString(ar));
		}
	}

}
/*
[100, 200]
[300, 400]
[500, 600]
*/
package in.array;

public class Reversing_Array {

	public static void main(String[] args) {
		int[] arr1 = { 15, 8, 9, 2, 11, 4 };

		int[] temp = new int[arr1.length];// storing Array value in temp
		int cnt = 0;// variable to store value

		// swapping Array
		for (int i = arr1.length - 1; i >= 0; i--) {
			temp[cnt] = arr1[i];
			cnt++;
		}
		for (int n : temp) {
			System.out.print(n + ",");
		}

	}
}
//4,11,2,9,8,15,
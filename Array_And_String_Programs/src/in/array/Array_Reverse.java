package in.array;

public class Array_Reverse {

	public static void main(String[] args) {
		int[] arr = { 15, 8, 9, 2, 11, 4 };
		int temp = 0; // means arr.length/2;

		for (int i = 0; i < arr.length / 2; i++) {
			temp = arr[i];// first index value stored into temp variable
			arr[i] = arr[arr.length - 1 - i];// last index value stored into first index
			arr[arr.length - 1 - i] = temp;// temp value stored into last index
		}

		for (int n : arr) {
			System.out.print(n + ",");
		}

	}
}
//4,11,2,9,8,15,
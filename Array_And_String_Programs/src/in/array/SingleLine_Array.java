package in.array;

public class SingleLine_Array {

	public static void main(String[] args) {
		int[] arr = { 15, 12, 10, 14, 15, 19 };//=> Array Size should be always positive

		arr[0] = 27;// updating value of index 0

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}

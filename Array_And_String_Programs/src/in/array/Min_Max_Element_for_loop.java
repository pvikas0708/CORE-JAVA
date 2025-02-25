package in.array;

public class Min_Max_Element_for_loop {

	public static void main(String[] args) {

		int[] arr = { 15, 19, 18, 27, 12, 16, 10, 13, 14, 24, 52, 63, 25, 52 };
		int min = arr[0];// creating variable to store value
		int max = arr[0];// creating variable to store value

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Max Array ::" + max);
		System.out.println("Min Array ::" + min);

	}
}

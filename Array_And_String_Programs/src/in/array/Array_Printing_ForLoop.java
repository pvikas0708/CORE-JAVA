package in.array;

public class Array_Printing_ForLoop {

	public static void main(String[] args) {
		int[] arr = new int[3];

		arr[0] = 100;
		arr[1] = 101;
		arr[2] = 102;

		System.out.println(arr.length); //Array size
		
		for (int i = 0; i <arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}

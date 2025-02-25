package in.array;

public class Double_Array {

	public static void main(String[] args) {

		double[] arr = new double[3];
		arr[0] = 100.1;
		arr[1] = 200.0;
		arr[2] = 255.7;

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
//Default value=>0.0
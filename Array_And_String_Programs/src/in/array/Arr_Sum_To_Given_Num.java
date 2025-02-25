package in.array;

public class Arr_Sum_To_Given_Num {

	public static void main(String[] args) {
		int arr[] = { 3, 5, 1, 6, 2, 7, 9 };

		int sum = 8;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == sum) {
					System.out.println(arr[i] + "+" + arr[j] + "=" + sum);
				}
			}
		}
	}
}
/*3+5=8
  1+7=8
  6+2=8*/
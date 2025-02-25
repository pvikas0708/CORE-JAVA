package vikas;

public class StringReverse_A3 {

	public static void main(String[] args) {

		String s = "java";

		char[] arr = s.toCharArray();

		String s1 = "";

		for (int i = arr.length - 1; i >= 0; i--)// it will give each char of array from last to 1st
		{
			s1 = s1 + arr[i];

		}
		System.out.println(s1);
	}

}

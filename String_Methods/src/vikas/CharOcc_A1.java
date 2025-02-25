package vikas;

public class CharOcc_A1 {

	public static void main(String[] args) {

		String s = "java";

		char ch = 'a';

		// can be done in two ways 1.charAt() 2.toCharAt()

		char arr[] = s.toCharArray();// String converted to char array

		int count = 0;

		for (int i = 0; i < arr.length; i++)// to traverse array
		{
			if (arr[i] == 'a') //if condition satisfies count ++ 
			{
				count++;
			}
		}
		System.out.println(count);
	}
}

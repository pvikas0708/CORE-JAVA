package vikas;

public class StringDemo {

	public static void main(String[] args) {

		String s1 = "hi";

		String s2 = "hi";

		if (s1 == s2)// will compare address
		{
			System.out.println("Both are same");
		} else {
			System.out.println("Both are not same");
		}
	}
}

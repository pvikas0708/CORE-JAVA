package vikas;

public class Palindrome_A2 {

	public static void main(String[] args) {

		String s = "MADAM";

		StringBuffer sb = new StringBuffer(s);
		sb.reverse();

		String s1 = sb.toString(); // s is a String and sb is String buffer si we need to convert sb in String else
									// program will not work

		if (s.equals(s1)) {
			System.out.println("String is palindrom...!");
		} else {
			System.out.println("String is not palindrom");
		}
	}
}

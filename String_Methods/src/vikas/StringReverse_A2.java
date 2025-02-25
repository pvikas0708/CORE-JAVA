package vikas;

public class StringReverse_A2 {

	public static void main(String[] args) {

		String s = "java";
		String rev = "";

		// we need to start String from last
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);// a+v+a+j
		}
		System.out.println(rev);
	}

}

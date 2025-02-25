package in.vikas;

import java.util.StringTokenizer;

public class StringTokenizer_Demo {

	public static void main(String[] args) {
		String s = "java programming course...!";

		StringTokenizer st = new StringTokenizer(s, " ");

		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
/*Output:
	java
	programming
	course...!
*/
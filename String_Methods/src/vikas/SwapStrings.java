package vikas;

public class SwapStrings {

	public static void main(String[] args) {

		String a = "java"; // 4
		String b = "program"; // 7

		a = a + b; // 11 (javaprogram)

		b = a.substring(0, a.length() - b.length());

		a = a.substring(b.length());

		System.out.println(" a = " + a);
		System.out.println(" b = " + b);

	}

}

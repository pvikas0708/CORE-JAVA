package vikas;

public class RemoveVowels {

	public static void main(String[] args) {

		String s = "Hello, I Love My India";

		s = s.replaceAll("[aeiouAEIOU]", "");//[]<- important else it will check for sequence

		System.out.println(s);

	}
}

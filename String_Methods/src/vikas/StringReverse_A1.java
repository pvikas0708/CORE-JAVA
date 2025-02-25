package vikas;

public class StringReverse_A1 {

		
	public static void main(String[] args) {
		String s = "java";

		// s.reverse() reverse() is not available in String class its in StringBuffer
		//we need to convert String to String buffer
		
		StringBuffer sb=new StringBuffer(s);
		sb.reverse();
		
		System.out.println(sb);
		
	}
}

package vikas;

public class Palindrome_A1 {

	public static void main(String[] args) {
		
		String s="MADAM";
		String s1=""; // to store new String=>M+A+D+A+M
		
		for(int i=s.length()-1;i>=0;i--)
		{
			s1=s1+s.charAt(i);
		}
		if(s.equals(s1))
		{
			System.out.println("String is Palindrom...!");
		}else
		{
			System.out.println("String is not Palindrom");
		}
		
	}
}

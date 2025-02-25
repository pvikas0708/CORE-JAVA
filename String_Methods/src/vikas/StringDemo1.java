package vikas;

public class StringDemo1 {

	public static void main(String[] args) {
		
		String s1=new String("hello");
		
		String s2=new String("hello");
		
		if(s1==s2)// will compare address
		{
			System.out.println("Both are same");
		}
		else
		{
			System.out.println("Both are not same");
		}
	}
}

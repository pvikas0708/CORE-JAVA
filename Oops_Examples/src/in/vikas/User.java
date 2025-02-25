package in.vikas;

public class User {

	public static void main(String[] args) {

		User u1 = new User();

		System.out.println(u1.hashCode());
		
		User u2 = new User();
		System.out.println(u2.hashCode());

		User u3 = new User();
		System.out.println(u3.hashCode());

	}

}
/*OUTPUT:
   1175962212
   918221580
   2055281021
 */
 
 

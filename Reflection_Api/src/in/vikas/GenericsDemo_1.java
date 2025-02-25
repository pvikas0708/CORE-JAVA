package in.vikas;

public class GenericsDemo_1<T> {

	T obj;

	public void m1(T args) {
		System.out.println("Param Recieved : "+args );
	}

	public static void main(String[] args) throws Exception {
		GenericsDemo_1 d = new GenericsDemo_1();

		d.m1(10); // passing int value
		d.m1("hi"); // passing String value => allowed after Generics
		d.m1(100.51); // passing double value => allowed after Generics
		d.m1(true); // passing boolean value => allowed after Generics
	}

}
/*Output:
	Param Recieved : 10
	Param Recieved : hi
	Param Recieved : 100.51
	Param Recieved : true
*/
	
package in.vikas;

public class Type_Safety_Demo<T> {

	T obj;

	void add(T obj) {
		this.obj = obj;
	}

	T get() {
		return obj;
	}

	public static void main(String[] args) throws Exception {
		// <Integer>=> type-safety
		Type_Safety_Demo<Integer> d1 = new Type_Safety_Demo<>();
		d1.add(10);
		System.out.println(d1.get());

		// <String>=> type-safety
		Type_Safety_Demo<String> d2 = new Type_Safety_Demo<>();
		d2.add("Hi");
		System.out.println(d2.get());
	}

}
/*Output:
	10
	Hi
*/
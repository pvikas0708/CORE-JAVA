package in.vikas;

public class Type_Safety_Demo_2<T1, T2> {

	T1 obj1;
	T2 obj2;

	Type_Safety_Demo_2(T1 obj1, T2 obj2) {
		this.obj1 = obj1;
		this.obj2 = obj2;
	}

	void print() {
		System.out.println(obj1 + ", " + obj2);
	}

	public static void main(String[] args) throws Exception {
		Type_Safety_Demo_2<Integer, String> d1 = new Type_Safety_Demo_2<>(101, "Ram");
		d1.print();

		Type_Safety_Demo_2<String, Long> d2 = new Type_Safety_Demo_2<>("Ashok", 798686868l);
		d2.print();

		Type_Safety_Demo_2<String, Boolean> d3 = new Type_Safety_Demo_2<>("Raju", true);
		d3.print();
	}

}

/*Output:
	101, Ram
	Ashok, 798686868
	Raju, true
*/
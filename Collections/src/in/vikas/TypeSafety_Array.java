package in.vikas;

import java.util.ArrayList;
import java.util.List;

public class TypeSafety_Array {

	public static void main(String[] args) {

		// type-Safety of Integer type
		List<Integer> l = new ArrayList<>();

		l.add(100);
		l.add(200);
		l.add(500);
		//l.add("Vikas");It is Type safety of Integer it will not accept String data

		System.out.println(l); // It is Type safety of Integer we can add Integer values only
	}

}

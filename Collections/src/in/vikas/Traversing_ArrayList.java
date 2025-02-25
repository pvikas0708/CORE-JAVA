package in.vikas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Traversing_ArrayList {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);

		System.out.println(al.size()); // 4

		System.out.println("======For Loop Approach=======");
		// Approach-1=> to get data of ArrayList
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i)); // loop will execute 4 times starting from 0
		}

		System.out.println("======For-Each loop Approach=======");
		// Approach-2 to get data of ArrayList
		for (Object obj : al) // we have not declared ArrayList as type-safety so need to take Object else type safety data type
		{
			System.out.println(obj);
		}

		System.out.println("=====Iterator Approach=====");
		// Approach-3 to get data of ArrayList
		Iterator iterator = al.iterator();// it will traverse the ArrayList only forward Direction
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("=====ListIterator Approach=====");
		// Approach-4 listIterator
		ListIterator listIterator = al.listIterator();// it will traverse the ArrayList both in forward and backward
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}

		System.out.println("=====forEach ( ) Approach=====");
		// Approach-5 Lamda Expression
		al.forEach(i -> {
			System.out.println(i);
		});
	}
}

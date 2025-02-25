package in.vikas;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Fail_Safe_Demo3_1 {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<>();

		map.put(101, "one");
		map.put(102, "two");
		map.put(103, "three");

		Set<Integer> keySet = map.keySet();
		Iterator<Integer> iterator = keySet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			map.put(104, "four");
		}

	}

}
//101 & Exception in thread "main" java.util.ConcurrentModificationException
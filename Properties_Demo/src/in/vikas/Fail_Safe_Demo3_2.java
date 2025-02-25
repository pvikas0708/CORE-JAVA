package in.vikas;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class Fail_Safe_Demo3_2 {

	public static void main(String[] args) {

		ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();

		map.put(101, "one");
		map.put(102, "two");
		map.put(103, "three");

		Set<Integer> keySet = map.keySet();
		Iterator<Integer> iterator = keySet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			map.put(104, "four");
		}

		System.out.println(map);

	}

}

/*Output:
	101
	102
	103
	104
	{101=one, 102=two, 103=three, 104=four}
*/
package in.vikas;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_Demo {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>(); // creating object of implemention class of map=> HashMap

		map.put(101, "John");
		map.put(102, "Smith");
		map.put(103, "Orlen");
		map.put(102, "David");// value of 102 key will be replaced with Smith=>David

		System.out.println("Map size::" + map.size()); // map.size() =>total objects

		System.out.println(map.containsKey(102));// checks if key available and returns boolean value true
		System.out.println(map.containsKey(300));// false
		System.out.println(map.isEmpty());// false

		System.out.println(map);// overrides toString () method of HashMap class not object class (object class
								// object will be printed)
		System.out.println(map.size());// 3

		System.out.println(map.get(101)); // John
		System.out.println(map.get(300)); // if given key is not available it gives null value

		// map.clear(); clears the Map

		System.out.println(map);

		System.out.println();
		System.out.println("=================Only-Keys=================");

		Set<Integer> keySet = map.keySet(); // to get keys
		for (Integer key : keySet) {
			System.out.print(key + " "); // to get only keys
			System.out.println(map.get(key));// to get values based on given key
		}

		System.out.println();
		System.out.println("=================Only-Values=================");

		Collection<String> values = map.values();// to get only values=> returns collection
		for (String v : values) {
			System.out.println(v);
		}

		// cursor is not available for Map thats why direct methods values etc are
		// there in Map=> cursor is only available for List and set
		Set<Entry<Integer, String>> entrySet = map.entrySet();// to traverse all the keys and values=> Entry is also a
																// interface

		System.out.println("=================Keys-Values=================");
		Iterator<Entry<Integer, String>> iterator = entrySet.iterator();
		while (iterator.hasNext()) {
			Entry<Integer, String> entry = iterator.next();
			System.out.println(entry.getKey() + " -- " + entry.getValue());
		}

		// or we can go with for each loop also
		System.out.println("=================For-Each-loop=================");
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry.getKey() + "--" + entry.getValue());
		}

	}
}

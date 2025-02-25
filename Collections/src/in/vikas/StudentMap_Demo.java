package in.vikas;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StudentMap_Demo {

	public static void main(String[] args) {

		Student s1 = new Student(101, "John");
		Student s2 = new Student(102, "Smith");
		Student s3 = new Student(103, "Orlen");

		Map<Integer, Student> map = new HashMap<Integer, Student>();
		// map.put(Key, Value);

		map.put(1, s1);
		map.put(2, s2);
		map.put(3, s3);

		System.out.println(map); // Overrides Student class toString() method if there is no toString() in
									// Student class object will be printed

		System.out.println(map.containsKey(4));// false

		System.out.println("===============To-Get-All-Keys-Values===============");

		Set<Integer> keySet = map.keySet();
		for (Integer key : keySet) {
			System.out.println(map.get(key));
		}
		System.out.println("===============To-Get-All-The-Entries-Available-in-Map===============");
		Set<Entry<Integer, Student>> entrySet = map.entrySet();
		for (Entry<Integer, Student> entry : entrySet) {
			System.out.println(entry.getKey() + "--" + entry.getValue());
		}

	}
}

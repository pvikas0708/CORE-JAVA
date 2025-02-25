package in.vikas;

import java.util.TreeMap;

public class TreeMap_Demo {

	public static void main(String[] args) {

		TreeMap<String, Integer> map = new TreeMap<String, Integer>();
		map.put("Vikas", 101);
		map.put("Balaji", 200);
		map.put("Pooja", 50);
		map.put("Juhee", 150);
		map.put("Shreyas", 350);

		System.out.println(map);// sorting is applicable for keys
	}
}
//Output:{Balaji=200, Juhee=150, Pooja=50, Shreyas=350, Vikas=101}
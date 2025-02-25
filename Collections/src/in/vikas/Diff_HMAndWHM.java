package in.vikas;

import java.util.WeakHashMap;

public class Diff_HMAndWHM {

	public static void main(String[] args) {

		WeakHashMap<Integer, String> whm = new WeakHashMap<>();

		whm.put(1, "hi");
		whm.put(2, "hello");
		whm.put(4, "java");
		whm.put(3, "bye");

		System.out.println(whm);
	}

}
//{4=java, 3=bye, 2=hello, 1=hi}

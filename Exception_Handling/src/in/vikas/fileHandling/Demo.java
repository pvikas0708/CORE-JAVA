package in.vikas.fileHandling;

import java.io.File;
import java.io.IOException;

public class Demo {

	public static void main(String... args) throws Exception {

		File f = new File("C:\\Users\\user\\Desktop\\ROUGH");

		String[] arr = f.list();// to read all the content available in directory

		for (String name : arr) {
			System.out.println(name);

		}
	}
}

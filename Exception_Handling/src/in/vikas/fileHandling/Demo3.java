package in.vikas.fileHandling;

import java.io.File;
import java.io.IOException;

public class Demo3 {
	public static void main(String... args) throws IOException {

		File f = new File("C:\\Users\\user\\Desktop\\ROUGH");

		String[] arr = f.list();

		for (String name : arr) {

			File f1 = new File(f, name);

			if (f1.isFile()) {
				System.out.println("File :: " + name);
			}

			if (f1.isDirectory()) {
				System.out.println("Directory  :: " + name);
			}
		}
	}

}

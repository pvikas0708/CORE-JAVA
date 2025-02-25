package in.vikas.fileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class Demo2 {

	public static void main(String... args) throws IOException {

		FileWriter fw = new FileWriter("data.txt");
		
		FileWriter fw2 = new FileWriter("data.txt");

		fw.write("Hi, good evening");

		fw.write("\n"); // it represents new line

		fw.write("How are you?");

		fw.flush();

		fw.close();
	}

}

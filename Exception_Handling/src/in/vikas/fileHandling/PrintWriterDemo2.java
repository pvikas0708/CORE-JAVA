package in.vikas.fileHandling;

import java.io.PrintWriter;

public class PrintWriterDemo2 {

	public static void main(String[] args) throws Exception {
		PrintWriter pw = new PrintWriter("f1.txt");
		pw.write("This is my first data");

		pw.flush();

		pw.close();
	}
}

package in.vikas.fileHandling;

import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) {
		PrintWriter pw = new PrintWriter(System.out);

		pw.print("hi");
		pw.println(" Hello");
		
		pw.flush(); // sends data forcefully without flush we cant print on console
		pw.close();

	}

}
//Output:hi Hello
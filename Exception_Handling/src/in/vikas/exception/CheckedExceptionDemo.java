package in.vikas.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionDemo {

	public static void main(String[] args) throws FileNotFoundException {

		FileReader fr = new FileReader("abc.txt");

	}

}

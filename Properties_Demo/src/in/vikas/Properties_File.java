package in.vikas;

import java.io.FileInputStream;
import java.util.Properties;

public class Properties_File {

	public static void main(String[] args) throws Exception {

		FileInputStream fis = new FileInputStream("database.properties");

		Properties p = new Properties();
		p.load(fis); // load all the properties from properties file

		System.out.println(p);

		String uname = p.getProperty("uname");
		String pwd = p.getProperty("pwd");
		String driver = p.getProperty("driver"); // key not present

		System.out.println("Username: " + uname);// root
		System.out.println("Password: " + pwd); // root
		System.out.println("Driver: " + driver); // null

		fis.close();
	}

}

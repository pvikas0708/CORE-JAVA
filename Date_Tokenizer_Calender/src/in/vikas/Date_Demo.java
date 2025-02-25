package in.vikas;

import java.time.Year;
import java.util.Calendar;
import java.util.Date;

public class Date_Demo {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d); // prints current date=>Thu Feb 20 23:56:49 IST 2025

		//Calendar c = new Calendar.getInstance();
		//System.out.println(c.get(Calendar.YEAR));
		//System.out.println(c.get(Calendar.HOUR_OF_DAY));
	}
}

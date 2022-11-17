package test;

import java.util.Date;
import java.util.GregorianCalendar;

public class Ex2 {
	public static void main(String[] args) {
		GregorianCalendar calender = new GregorianCalendar();
		Date date = new Date();

		calender.setTime(date);
		System.out.println("TIME: " + calender.getTime());
		System.out.println("YEAR: " + calender.get(calender.YEAR));
		System.out.println("MONTH: " + calender.get(calender.MONTH));
		System.out.println("DATE: " + calender.get(calender.DATE));

		System.out.println("DAY_OF_YEAR: " + calender.get(calender.DAY_OF_YEAR));
		System.out.println("HOUR_OF_DAY: " + calender.get(calender.HOUR_OF_DAY));


	}

}

package test;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class Ex3 {
	public static void main(String[] args) {
		GregorianCalendar ca = new GregorianCalendar();
		Date date = new Date();
		SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd :hh:mm:ss");
		System.out.println(dateFormat.format(date));
		System.out.println("TIME: " + ca.getTime());


	}
}

package DataNumeroMoeda;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.SimpleFormatter;

public class SimpleDate {

	public static void main(String[] args) {
		
		
		SimpleDateFormat simple = new SimpleDateFormat("dd-MMMMMMMM-yyyy HH:mm a z");
		Calendar c = new GregorianCalendar(2019,00,07,15,24);
	
	
		System.out.println(simple.format(c.getTime()));
		Date data = new Date();
		System.out.println(simple.format(c.getTime()));
		
		SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
		Calendar ca = new GregorianCalendar(1989, 06, 24);
		System.out.println(f.format(ca.getTime()));
		
		SimpleDateFormat s = new SimpleDateFormat("yyy/MMM/dd");
		Date di = new Date();
		System.out.println(s.format(di.getTime()));
		

	}

}

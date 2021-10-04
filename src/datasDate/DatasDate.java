package datasDate;

import java.util.Calendar;
import java.util.Date;

public class DatasDate {



	public static void main(String[] args) {
		
		Date date = new Date();
		date.setTime(date.getTime() + 3_000_000);
		System.out.println(date);

		Calendar c = Calendar.getInstance();
			//c.setTime(date);
			if(Calendar.SUNDAY == c.getFirstDayOfWeek()) {
				System.out.println("USA domingo primeiro dia semana");
			}
			System.out.println(c.get(Calendar.DAY_OF_MONTH));
			System.out.println(c.get(Calendar.DAY_OF_WEEK));
			System.out.println(c.get(Calendar.DAY_OF_YEAR));
			c.add(Calendar.HOUR,2);  	// acrescenta duas horas a hora
			c.add(Calendar.MONTH,8);	// acrescenta o meses a data
			Date date2 = c.getTime();
			System.out.println(date2);
		
	}
				// NumberFormat
				// Locale
				// Calendar
				// Date
				// DateFormat
}

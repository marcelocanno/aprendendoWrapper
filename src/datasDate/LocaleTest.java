package datasDate;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest {

	public static void main(String[] args) {
		
		// ISO 639 pt portugues pr Brasil en ingles Us estados unidos
		
		Locale locItaly = new Locale("it", "IT");		
		Locale locSuiss = new Locale("it", "CH");
		Locale locIndia = new Locale("hi" , "IN");
		Locale locJapao = new Locale("ja");
		
		Calendar c = Calendar.getInstance();
				//c.set(2018, Calendar.DECEMBER,24);
		//Calendar c1 = Calendar.getInstance();
		//c1.set(2020, Calendar.JANUARY,1);
		//Calendar c2 = Calendar.getInstance();
		//c2.set(2020,Calendar.APRIL,9);
		//Calendar c3 = Calendar.getInstance();
		//c3.set(2019, Calendar.DECEMBER,24);
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL,locItaly);
		DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL,locSuiss);
		DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL,locIndia);
		DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL,locJapao);
		System.out.println("Italy : " + df.format(c.getTime()));
		System.out.println("Suiss : " + df1.format(c.getTime()));
		System.out.println("India : " + df2.format(c.getTime()));
		System.out.println("Japan : " + df3.format(c.getTime()));
		
		System.out.println(locItaly.getDisplayLanguage());
		System.out.println(locSuiss.getDisplayLanguage());
		System.out.println(locIndia.getDisplayLanguage());
		System.out.println(locJapao.getDisplayLanguage());
		
		// o sistema não respondeu no idioma local
		
		//System.out.println(df2.format(c2.getTime()));
		//System.out.println(df2.format(c2.getTime()));
		//System.out.println(df3.format(c3.getTime()));
		//System.out.println(df3.format(c3.getTime()));
		// incluido outras simulações
	}

}

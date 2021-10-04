package datasDate;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest {

	public static void main(String[] args) {
		
		float valor = 123456.4567f;
		Locale locJP = new Locale("JP");
		Locale locFR = new Locale("FR");
		Locale locIT = new Locale("IT");
		NumberFormat[] nfa = new NumberFormat[4];
		nfa[0] = NumberFormat.getInstance();
		nfa[1] = NumberFormat.getInstance(locJP);
		nfa[2] = NumberFormat.getCurrencyInstance(locFR);
		nfa[3] = NumberFormat.getCurrencyInstance(locIT);
		for(NumberFormat nf : nfa) {
			System.out.println(nf.format(valor));
		}
		NumberFormat nf = NumberFormat.getInstance();
		System.out.println(nf.getMaximumFractionDigits());
		nf.setMaximumFractionDigits(5);
		System.out.println(nf.format(valor));
	}

}

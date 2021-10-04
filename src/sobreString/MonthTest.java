package sobreString;

import java.util.Scanner;

public class MonthTest {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int month;
		month = input.nextInt();
		String[] meses = {"janury","february","march","april", "may","june","july","august","setember","october","november","December"};
		if(month >=1 || month <=12) {
			System.out.print("digite o  mes");
			System.out.println(meses[month-1]);
		}else {
			System.out.println("Está errado");
		}
		
	}

}

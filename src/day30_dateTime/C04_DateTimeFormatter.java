package day30_dateTime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class C04_DateTimeFormatter {

	public static void main(String[] args) {

		LocalDate tarih = LocalDate.now();
		
		LocalDate date = LocalDate.of(2020, 5, 15);
		
		DateTimeFormatter dtf0 = DateTimeFormatter.ofPattern("dd/M/yy");
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yy");
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MMM/yy");
		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd$M$yyyy");
		DateTimeFormatter dtf4 = DateTimeFormatter.ISO_ORDINAL_DATE;
		
		System.out.println(dtf0.format(tarih));
		System.out.println(dtf1.format(tarih));
		System.out.println(dtf2.format(tarih));
		System.out.println(dtf3.format(tarih));
		System.out.println(dtf4.format(tarih));
		
		System.out.println("");
		
		System.out.println(dtf0.format(date));
		System.out.println(dtf1.format(date));
		System.out.println(dtf2.format(date));
		System.out.println(dtf3.format(date));
		
		Period fark = Period.between(date, tarih);
	
		System.out.println(fark.getYears());
		
	}

}

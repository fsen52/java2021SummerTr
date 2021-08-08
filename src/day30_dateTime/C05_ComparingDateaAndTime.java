package day30_dateTime;

import java.time.LocalDate;
import java.time.Month;

public class C05_ComparingDateaAndTime {

	public static void main(String[] args) {

		LocalDate bugun = LocalDate.now();
		
		LocalDate diger = LocalDate.of(2015, 11, 29);
		
		int fark = bugun.compareTo(diger);
		
		System.out.println(bugun);
		
		System.out.println(diger);
		
		System.out.println(fark);
		
		LocalDate tarih = LocalDate.of(2014, Month.JUNE, 29);
		
		System.out.println(tarih.getMonth());
		
		System.out.println(tarih);
		
		
	}

}

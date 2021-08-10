package day30_dateTime;

import java.time.LocalDate;

public class C01_LocalDate {

	public static void main(String[] args) {
		
		LocalDate tarih = LocalDate.now();
		
		
		System.out.println(tarih);
		
		
		System.out.println(tarih.plusDays(21));
		
		System.out.println(tarih.plusDays(2).plusMonths(3).plusYears(5));
		
		System.out.println(tarih.getDayOfMonth());
		
		System.out.println(tarih.getMonth());
		
		LocalDate dogum = LocalDate.of(1994, 1, 1);
		
		System.out.println(dogum);
		
		 System.out.println(LocalDate.EPOCH);
		
		
	}

}

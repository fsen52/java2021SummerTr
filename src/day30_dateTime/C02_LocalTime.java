package day30_dateTime;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class C02_LocalTime {

	public static void main(String[] args) {

		LocalTime zaman = LocalTime.now();
		
		System.out.println(zaman);
		
		LocalTime zaman1 = LocalTime.of(12, 35, 51);
		
		System.out.println(zaman1.plusMinutes(35));
				
		LocalTime basla = LocalTime.now();
		
		for (int i = 0; i<=100000 ; i++) {
			
			i+=1;
		}
		
		LocalTime bitir = LocalTime.now();

		System.out.println("");
		System.out.println(basla + " ----- " + bitir);
		
		
		//Ülke Saatleri
		
		
		ZonedDateTime nd = ZonedDateTime.now(ZoneId.of("Europe/Amsterdam"));
		
		System.out.println(nd);
		
	}

}

package day04_increment_matematiksel_islemler;

import java.util.Scanner;

public class C04_Modulus {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("lütfen rakamlarının toplamını hesaplamak istediğniz 4 basamaklı sayıyı giriniz");
		
		int value = scan.nextInt() ;
		
		int rakamToplamı = 0 ; 
		 
		int rakam = value%10 ;
		
		rakamToplamı += rakam ;
		
		System.out.println(rakamToplamı);
		
		value = value/10;
		
		rakam = value%10 ;
		
		rakamToplamı += rakam ;
		
		System.out.println(rakamToplamı);
		
		value = value/10;

		rakam = value%10 ;
		
		rakamToplamı += rakam ;
		
		System.out.println(rakamToplamı);
		
		value = value/10;

		rakam = value%10 ;
		
		rakamToplamı += rakam ;
		
		System.out.println(rakamToplamı);

		
		scan.close();
	}

}

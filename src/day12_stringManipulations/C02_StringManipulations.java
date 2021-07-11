package day12_stringManipulations;

import java.util.Scanner;

public class C02_StringManipulations {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Lütfen adınızı ve soyadınızı giriniz : ");
		
		String isim =  scan.nextLine();
		
		System.out.print("Lütfen Kart Numaranızı giriniz : ");
		
		String kartN = scan.nextLine();
		
		String isimY = isim.substring(0,1)+isim.substring(1).replaceAll("\\w","*");
		
		System.out.println(isimY+""+kartN);
		
		 
		

		
		
		scan.close();
	}

}

package day11_stringManipulations;

import java.util.Scanner;

public class C01_StringManipulations01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Bir cümle giriniz : ");
		
		String cumle = scan.nextLine().toLowerCase();
		
		System.out.print("Bir kelime giriniz : ");
		
		String kelime = scan.nextLine().toLowerCase();
		
		
		//indexOf() ile kullanım
		
		if (cumle.indexOf(kelime) != -1) {
			System.out.println("Bu kelime bu cümlede geçiyor");
			
		}else {System.out.println("Bu kelime bu cümlede geçmiyor");
	
		}
		
		//contains() ile kullanım
		
		if (cumle.contains(kelime)) {
			System.out.println("Bu kelime bu cümlede geçiyor");
			
		}else {System.out.println("Bu kelime bu cümlede geçmiyor");
	
		}
	
	
	
	
	
	
	
	scan.close();
	}

}

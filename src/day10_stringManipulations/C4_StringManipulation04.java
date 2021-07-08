package day10_stringManipulations;

import java.util.Scanner;

public class C4_StringManipulation04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Bir cümle giriniz : ");
		
		String cumle = scan.nextLine().toLowerCase();
		
		System.out.print("Bir kelime giriniz : ");
		
		String kelime = scan.next().toLowerCase();
		
		
		int ilkKullanımIndex = cumle.indexOf(kelime);
		
		int	sonKullanımIndex = cumle.lastIndexOf(kelime);
		
		System.out.println(sonKullanımIndex);
		
		if (ilkKullanımIndex == -1) {
			System.out.println("bu kelime cumlede geçmiyor");
			
		}else if(ilkKullanımIndex == sonKullanımIndex) {
			System.out.println("bu kelime bir kere geçiyor");
		
		}else {
			System.out.println("bu kelime birden fazla kullanılmış");
			
		}
		
	
		
		scan.close();
	}

}

package day13_methodCreation;

import java.util.Scanner;

public class Answer_3 {

	public static void main(String[] args) {

// Email kontrolu yapan bir program yazin.Kullanicinin girdigi sifre 
//		- @ isareti icermiyorsa gecersiz email yazdirin
//		- @gmail.com icermiyorsa “lutfen gmail adresinizi girin” yazdirin
//		- @gmail.com ile bitmiyorsa “Yazimda bir sorun var, maili kontrol ediniz”

		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Lütfen bir mail adresi giriniz : ");
		
		String mail = scan.nextLine();
	
		kontrol(mail);
	
	
	
		scan.close();
	}
	


	public static void kontrol(String mail) {
	
		if (!mail.contains("@")) {
		
			System.out.println("geçersiz mail");
		
		}
		else if(!mail.contains("@gmail.com")) {
		
			System.out.println("Lütfen 'gmail' adresinizi girin.");
		
		}
		else if(!mail.endsWith("@gmail.com")) {
		
			System.out.println("Yazımda bir sorun var, lütfen kontrol ediniz.");

		}
		else {System.out.println("Teşekkür ederiz.");
		}
		
		
	}	
		




}





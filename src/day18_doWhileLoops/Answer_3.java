package day18_doWhileLoops;

import java.util.Scanner;

public class Answer_3 {

	public static void main(String[] args) {
		
		
		/* Soru 3) Kullanicidan toplamak uzere pozitif sayilar isteyin, islemi bitirmek icin 0’a basmasini
		 * soyleyin.Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini ve girdigi pozitif sayilarin 
		 * toplaminin kac oldugunu yazdirin.
		*/
	
	Scanner scan = new Scanner(System.in);	
	
	
	int result = 0;
	
	int count = 0;
	
	
	System.out.println("lütfen toplamak istediğiniz pozitif sayıları giriniz, çıkmak için '0' a basınız.");
	
	while(true) {
		
		int x = scan.nextInt(); 
		
		if(x>0) {
		
		result+=x;
		
		count++;
		
		}else if (x<0) {
			
			System.out.println("lütfen pozitif bir sayı giriniz");
		
		}else {
			break;
			
		}
		
	
	}
	
	System.out.println(count + " pozitif sayı girdiniz, "+"bu sayıların toplamı : " + result);
	
	scan.close();
	
	}
	
	
	
	
	
	
	}



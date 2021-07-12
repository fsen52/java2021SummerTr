package day13_methodCreation;

import java.util.Scanner;

public class Answer_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*Kullanicidan bir sayi alin. Bu sayinin tek mi cift mi oldugunu, sifirdan buyuk mu 
kucuk mu oldugunu, ayrica ve 100’den buyukse birler,onlar ve yuzler basamagindaki 
rakamlarin toplamini,100’den kucukse sadece 1’ler basamagini yazdirin

*/
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("lütfen bir sayı giriniz : ");
		
		int sayi = scan.nextInt();
		
		kontrol(sayi);
	
		scan.close();
	}
	
	public static void kontrol (int sayi) {
		
		
		String ciftmi;
		String buyukluk;
		if (sayi % 2 == 0) {
		
			ciftmi = "çift";
			
		}else {
			ciftmi = "tek";
		}
		
		if (sayi >= 0) {
			
			buyukluk = "büyük";
				
		}else {
			buyukluk = "küçük";
		}
		
		if (sayi >= 100) {
			
			int birler = sayi%10;
			int onlar = (sayi/10)%10;
			int yüzler = (sayi/100)%10;
			
			int toplam =birler + onlar + yüzler;
			
			System.out.println("Bu sayının yüzler, onlar ve birler basamağındaki rakamların toplamı : " + toplam + "'dır/dir.");
					
		}else {
			
			System.out.println("Bu sayının birler basamağındaki rakam : " + sayi%10 + "'dır/dir.");
		}
	
	
		System.out.println("Bu sayı 0'dan " + buyukluk + " bir " + ciftmi + " sayıdır.");
	
	
	}
	
	

}

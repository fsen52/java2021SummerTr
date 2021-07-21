
package Example;

import java.util.Scanner;

public class H13 {
	public static void main(String[] args) {
		/*
		 * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
		 * musteri karti olup olmadigini sorun
		 *
		 * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
		 * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az alirsa %10
		 * indirim yapin
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("kaç adet alındı");
		int adet = scan.nextInt();
		System.out.println("fiyat nedir");
		double fiyat = scan.nextDouble();
		
		System.out.println("ilk fiyat : " + fiyat);
		System.out.println("Müşteri kartınız var mı?\nVarsa 'y' yoksa 'n' yazınız");
		char kart = scan.next().toLowerCase().charAt(0);
		double hesap;
		
		if (kart == 'y') {
			if (adet > 10) {
				fiyat *= 4 / 5;
				System.out.println("şimdi fiyat : " + fiyat);
				hesap = (adet * fiyat);
				System.out.println("Hesabınız: " + hesap);
			} else if (adet <= 10 && adet >= 0) {
				fiyat *= 85 / 100;
				hesap = (adet * fiyat);
				System.out.println("Hesabınız: " + hesap);
			} else {
				System.out.println("Hatalı giriş");
			}
		} else if (kart == 'n') {
			if (adet > 10) {
				fiyat *= 85 / 100;
				hesap = (adet * fiyat);
				System.out.println("Hesabınız: " + hesap);
			} else if (adet <= 10 && adet >= 0) {
				fiyat *= 9 / 10;
				hesap = (adet * fiyat);
				System.out.println("Hesabınız: " + hesap);
			} else {
				System.out.println("Hatalı giriş");
			}
		} else {
			System.out.println("Hatalı giriş");
		}
	}
}

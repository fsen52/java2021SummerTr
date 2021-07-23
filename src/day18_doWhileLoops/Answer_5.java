package day18_doWhileLoops;

import java.util.Scanner;

public class Answer_5 {

	public static void main(String[] args) {

		/*
		 * Soru 5 ) Kullanicidan bir sifre girmesini isteyin. Girilen sifreyi asagidaki
		 * sartlara gore kontrol
		 * 
		 * edin ve sifredeki hatalari yazdirin. Kullanici gecerli bir sifre girinceye
		 * kadar bu islemi tekrar edin ve gecerli sifre girdiginde “Sifreniz Kabul
		 * edilmistir” yazdirin.
		 * 
		 * - Sifre kucuk harf icermelidir - Sifre buyuk harf icermelidir - Sifre ozel
		 * karakter icermelidir - Sifre en az 8 karakter olmalidir.
		 * 
		 */

		Scanner scan = new Scanner(System.in);

		int buyukFlag = 0;

		int kucukFlag = 0;

		int ozelFlag = 0;

		int lengthFlag = 0;

		while (true) {

			System.out.print("Lütfen bir parola giriniz : ");

			String x = scan.nextLine();

			for (int i = 0; i < x.length(); i++) {

				if (x.charAt(i) >= 65 && x.charAt(i) <= 90) {

					buyukFlag++;
				}

				if (x.charAt(i) >= 97 && x.charAt(i) <= 122) {

					kucukFlag++;
				}

				if (x.charAt(i) >= 32 && x.charAt(i) <= 64 || x.charAt(i) >= 91 && x.charAt(i) <= 96
						|| x.charAt(i) >= 123 && x.charAt(i) <= 126) {

					ozelFlag++;
				}
				if (x.length() >= 8) {

					lengthFlag++;

				}
			}
				if (buyukFlag > 0 && kucukFlag > 0 && ozelFlag > 0 && lengthFlag > 0) {

					System.out.println("Kriterlere uygun bir şifre girdiniz");
					System.out.println(x);
					break;
				} else if (buyukFlag == 0) {
					System.out.println("lütfen şifrenizde büyük harf kullanın");

				} else if (kucukFlag == 0) {
					System.out.println("lütfen şifrenizde küçük harf kullanın");

				} else if (ozelFlag == 0) {
					System.out.println("lütfen şifrenizde özel karakter veya sayı kullanın");

				} else if (lengthFlag == 0) {
					System.out.println("lütfen şifrenizi 8 karakterden uzun olarak giriniz");

				}
			}
		
		
	scan.close();	
	}

}

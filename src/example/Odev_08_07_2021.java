package example;

import java.util.Scanner;

public class Odev_08_07_2021 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int mesafe = 0;

		System.out.print("lütfen gitmek istediğiniz şehri veya mesafeyi giriniz : ");

		String value = scan.next().toUpperCase();

		char deger = value.charAt(0);

		if ('A' <= deger && deger <= 'Z') {

			switch (deger) {

			case 'B':
				mesafe = 500;
				break;

			case 'C':
				mesafe = 700;
				break;

			case 'D':
				mesafe = 900;
				break;
			default:
				
			}
		} else {
			mesafe = Integer.parseInt(value);
		}

		double fiyat = mesafe * 0.1;
		double tfiyat = 0;

		System.out.print("lütfen yaşınızı giriniz : ");

		int yas = scan.nextInt();
jgvfytfrvhyvyt
			tfiyat *= 0.8;

		}

		System.out.println("Yolculuğunuz " + mesafe + " km olup. Bilet fiyatınız : " + tfiyat
				+ " $ dır. İyi yolculuklar dileriz.");
		scan.close();
	}

}

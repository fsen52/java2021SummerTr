package day09_switchCase;

import java.util.Scanner;

public class C1_SwitchCase01 {

	public static void main(String[] args) {

		// Haftanın kacıncı gunu olduğunu sorup hangi gün olduğunu yazdıran program

		Scanner scan = new Scanner(System.in);

		System.out.print("haftanın kacıncı gunu olduğunu girin  : ");

		int dayn = scan.nextInt();

		switch (dayn) {
		case 1:
			System.out.println("Pazartesi");
			break;

		case 2:
			System.out.println("Salı");
			break;
		
		case 3:
			System.out.println("Çarşamba");
			break;
		
		case 4:
			System.out.println("Perşembe");
			break;
		
		case 5:
			System.out.println("Cuma");
			break;
		
		case 6:
			System.out.println("Cumartesi");
			break;
		
		case 7:
			System.out.println("Pazar");
			break;
		
		default:
			System.out.println("Geçerli bir değer girmediniz");
		
		}
		scan.close();
	}

}

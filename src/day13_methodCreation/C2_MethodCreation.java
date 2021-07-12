package day13_methodCreation;

import java.util.Scanner;

public class C2_MethodCreation {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();
		
		toplama(sayi1,sayi2);
		carpma(sayi1,sayi2);
	scan.close();	
	}

	public static void carpma(int sayi1, int sayi2) {

		System.out.print("carpımları  : " + (sayi1*sayi2));
	}

	public static void toplama(int sayi1, int sayi2) {
		
		System.out.print("sayiların toplamları : " + (sayi1 + sayi2) );
	}

}

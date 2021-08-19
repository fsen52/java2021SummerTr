package day38_Exceptions;

import java.util.Scanner;

public class Exceptions01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int sayi1 = 10; //scan.nextInt();
		int sayi2 =  0; //scan.nextInt();
		
		try {
		
		System.out.println(sayi1/sayi2);
		
		}catch (ArithmeticException e){
			
			System.out.println("ne iştir bro?");
		}
		scan.close();
	}

}

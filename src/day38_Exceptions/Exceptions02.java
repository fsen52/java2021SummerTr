package day38_Exceptions;

import java.util.Scanner;

public class Exceptions02 {

	public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
		
		
	
		int count=0;
		
		while(count<100) {
		
		System.out.println("count : "+ count);	
		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();	
		try {
		
		System.out.println(sayi1/sayi2);
		
		}catch (ArithmeticException e){
			
			System.out.println("ne iştir bro?");
		}
		
		count++;
	}
	scan.close();
	}
}

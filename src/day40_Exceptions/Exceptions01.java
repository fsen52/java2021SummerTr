package day40_Exceptions;

import java.util.Scanner;

public class Exceptions01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("lütfen bir yaş giriniz : ");
		
		int yas = scan.nextInt();
		
		try {
		if (yas>=0) {
			
			System.out.println("yasınız : ");
		} else {
			throw new IllegalArgumentException();
		}
		}catch (IllegalArgumentException e) {
			
			e.printStackTrace();
		}
		System.out.println("kod bloke olmadı");
		
	}

}

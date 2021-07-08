package day10_stringManipulations;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Değer gir ula  : ");
		
		int value = scan.nextInt();
		
		switch (value) {
		case 10:
			System.out.println("ne demek la");
			break;

		default:
			System.out.println("hadi ordan");
			break;
		}
		scan.close();
	}

}

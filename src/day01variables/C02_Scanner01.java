package day01variables;

import java.util.Scanner;

public class C02_Scanner01 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a Username : ");

		String userName = scan.nextLine();
		
		System.out.println("User name is " + userName);
		scan.close();
	}
}

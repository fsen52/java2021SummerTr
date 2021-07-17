package day15_forLoops;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		String ters = "";
		
		System.out.println("lütfen bir kelime giriniz");
		
		String x = scan.next();
		
		for (int i=x.length();i>0;i--) {
			
			ters +=x.substring(i-1, i);
			
			
		}
		if (ters.equals(x)) {
			
			System.out.println("bu bir palindrome dur");
		}
	scan.close();	
		
	}

}

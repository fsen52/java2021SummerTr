package day10_stringManipulations;

import java.util.Scanner;

public class C3_StringManipulation03 {

	public static void main(String[] args) {

//		String str = "Java da neymiş";
//		
//		System.out.println(str.indexOf("e"));
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Bir metin giriniz : ");
		
		String cumle = scan.nextLine().toLowerCase();
		
		if (cumle.indexOf("java") == -1) {
			System.out.println("boş konuşuysun");
		}else {System.out.println("Ha şöyle...");
		
		}
		
		
		scan.close();
	}

}

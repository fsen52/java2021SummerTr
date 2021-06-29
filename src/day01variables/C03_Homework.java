package day01variables;

import java.util.Scanner;

public class C03_Homework {



public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("please enter 2 number for calculate  :");
	
	int num1 = scan.nextInt();
	int num2 = scan.nextInt();
	
	/* Question 1 ;
	 * 
	 * Kullanicidan iki tamsayi alip bu sayilarin toplam,fark ve carpimlarini yazdirin
	 * 
	 */
	
	System.out.println("first number is : " + num1 + "," + " second number is : " + num2 + "\n" );

	System.out.println("the sum of the 2 numbers you entered : " + (num1+num2) + "\n" );
		
	System.out.println("the difference of the 2 numbers you entered : " + Math.abs((num1-num2)) + "\n" );
	
	System.out.println("the multiplication of the 2 numbers you entered : " + (num1*num2) + "\n" );
	
	/* Question 2 ;
	 * 
	 * Kullanicidan ismini alip isminin bas harfini yazdirin.
	 * 
	 */
	
	System.out.println("Please enter your first name :");
	
	
	String name = scan.next();  
	
	scan.close();

	System.out.println("First letter of your name is : " + name.charAt(0));

}	


}

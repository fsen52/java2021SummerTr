package interviewquestions;

import java.util.Scanner;

public class Iq02 {

	public static void main(String[] args) {

		// Ask user the number of the fibonacci numbers then print fibonacci numbers on
		// the console

		Scanner scr = new Scanner(System.in);

		System.out.println("please enter a number : ");

		int value = scr.nextInt();
		
		fibonacci(value);
		
		scr.close();
	}

		public static void fibonacci(int value) {
		
		int a = 1;

		int b = 1;

		int c = 0;

		System.out.print(a + " " + b + " ");

		for (int i = 1; i < value - 1; i++) {

			c = a + b;
			a = b;
			b = c;

			System.out.print(c + " ");
		}
		
	  }

		
	
		
	}




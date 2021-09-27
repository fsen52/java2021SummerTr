package interviewquestions;

import java.util.Scanner;

public class Iq03 {

	public static void main(String[] args) {

		// Create a method to check if a number is prime or not

		Scanner scr = new Scanner(System.in);

		System.out.println("please enter a number : ");

		int value = scr.nextInt();

		isPrime(value);
		
		scr.close();
	}

	public static void isPrime(int value) {
		boolean result = false;
		int count = 0;

		for (int i = 1; i < value; i++) {

			if (value % i == 0) {

				count ++;
			}

		}
		if (value>0 && count <= 1) {

			result = true;
		}

		System.out.println(result);
	}

}

package interviewquestions;

//import java.util.Arrays;
//import java.util.Comparator;
import java.util.Scanner;

public class Iq01 {

	// Create a method to reverse given String

	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);

		System.out.print("Please enter a word to reverse : ");

		String str = scr.nextLine();

		System.out.println(reverse(str));

		scr.close();
	}

	public static String reverse(String word) {

		String result = "";

		for (int i = word.length() - 1; i >= 0; i--) {

			result += word.charAt(i);
		}

		return result;
	}
	
	public static String reverse2(String word) {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(word);
		
		return sb.reverse().toString();
		
		
		
	}

/*	public static String reverse3(String word) {
		
		String arr[] = word.split("");
		Arrays.stream(arr).collect
		

	}	
		
*/	
	
}

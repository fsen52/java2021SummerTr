package interviewquestions;

import java.util.Arrays;

public class Iq07 {

	/*
	 * Put akk zeros to end in integer array
	 * 
	 * {3, 0, 4, 2, 0} ==> {3, 4, 2, 0, 0, 0}
	 * 
	 */

	public static void main(String[] args) {

		int a[]={3, 0, 4, 2, 0};
		
		putZerosToEnd(a);
		
	}

	public static void putZerosToEnd(int a[]) {
		int b[] = new int[a.length];
		int index = 0;
		for (int i = 0; i < a.length; i++) {

			if (a[i] != 0) {

				b[index] = a[i];
				index++;

			}

		}

		System.out.println(Arrays.toString(b));
		
	}

}

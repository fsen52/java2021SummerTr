package day19_Arrays;

import java.util.Arrays;

public class C01_Arrays {

	public static void main(String[] args) {

		int MyArray[] = new int[3];

		MyArray[1] = 13;
		MyArray[2] = 32;

		// System.out.println(MyArray[1]);

		int arr[] = { 18, 15, 21, 27, 29, 3, 65 };

		arr = fonkSirala(arr);

		tersSirala(arr);

	}

	private static void tersSirala(int[] arr) {

		int[] x = new int[arr.length];

		for (int i = arr.length - 1; i >= 0; i--) {

			x[arr.length - 1 - i] = arr[i];

		}

		System.out.println(Arrays.toString(x));

	}

	private static int[] fonkSirala(int[] arr) {

		Arrays.sort(arr);

		return arr;

	}

}

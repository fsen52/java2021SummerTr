package example;

import java.util.*;

public class Other {

	public static void main(String[] args) {

		String str = "ananas";

		int count = 0;

		String result = "";

		String strValue = "";

		while (str.length() > 0) {

			char value = str.charAt(0);

			strValue = "" + value;

			for (int i = 0; i < str.length(); i++) {

				if (str.charAt(i) == value) {
					
					count++;

					

				}
				
			}
			result += value + "" + count;
			
			str = str.replaceAll(strValue, "");
			
			count=0;
			
			
		}
		
		System.out.println(result);
	}
}
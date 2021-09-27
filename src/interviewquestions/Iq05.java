package interviewquestions;

import java.util.HashMap;
import java.util.Map.Entry;

public class Iq05 {

	// Print repeated characters in a given String

	public static void main(String[] args) {

		String str = "aaabccccddd";

		repeatedChars(str);
		repeatedChars2(str);
	}

	
	public static void repeatedChars(String str) {

		// -----------------------------------------------------------------1 . Way
		String result = "";

		for (int i = 0; i < str.length(); i++) {

			String s1 = str.substring(i, i + 1);

			if (str.indexOf(s1) != str.lastIndexOf(s1)) {

				if (!result.contains(s1)) {

					result += s1;
				}
			}

		}

		System.out.println(result);

	}

	
	//---------------------------------------------------------------------2.Way
	
	private static void repeatedChars2(String str) {

		String a[] = str.split("");
		
		HashMap<String, Integer> map = new HashMap<>();
		
		for (String w : a) {
			
			if(!map.containsKey(w)) {
				
				map.put(w, 1);
			}else {
				map.put(w, map.get(w)+1);
				
			}
			
		}
		
		for (Entry<String, Integer> w : map.entrySet()) {
			
			if(w.getValue()>1) {
				
				//System.out.print(w + " ");
				
				System.out.print(w.getKey() + " ");
			}
			
			
		}
	}




















}

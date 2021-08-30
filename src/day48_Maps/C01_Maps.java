package day48_Maps;

import java.util.Hashtable;
import java.util.Map;

public class C01_Maps {

	public static void main(String[] args) {

		Map<String,Integer> yeni = new Hashtable<>();
		
		yeni.put("furkan", 1);
		yeni.put("emre",2);
		
		System.out.println(yeni.values());
		
		System.out.println(yeni);
		
		
		
	}

}

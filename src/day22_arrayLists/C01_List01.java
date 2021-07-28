package day22_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C01_List01 {

	public static void main(String[] args) {

		List<String> ilk = new ArrayList<>();
		
		
		ArrayList <String> yeni = new ArrayList<>();
		
		List<Integer> dahaYeni = new ArrayList<>();
		
		dahaYeni.add(12);
		dahaYeni.add(25);
		dahaYeni.add(36);
		
		dahaYeni.add(2,123);
		
		
		
		System.out.println(dahaYeni);
		
		List <String> isimler = new ArrayList <>();
	
		
		String vcx[] = new String[3];
		
		List <String> li = new ArrayList<>();	
		
		for (int eleman :dahaYeni) {
			
			System.out.println(eleman);
			
		}
		System.out.println(ilk.toString() + yeni.toString() + isimler.toString() + vcx.toString() + li.toString() );
	
	
	}

}

package day29_passByValue_mutableClass;

import java.util.ArrayList;
import java.util.List;

public class C01_PassByValue01 {

	public static void main(String[] args) {

		List<Integer> sayiList = new ArrayList<>();
		
		
		sayiList.add(10);
		sayiList.add(11);
		sayiList.add(12);
		
		System.out.println("ilk oluşturduğumuz liste : " + sayiList);
		
		forEachLoopIleArtir(sayiList);
		
		System.out.println(sayiList);
		
		
		
		
	}

	private static void forEachLoopIleArtir(List<Integer> sayiList) {
			
		System.out.print( "for each loop ile artırdığımız elemanlar : ");
		
		for (Integer each : sayiList) {
			
			each+=2;
			
			System.out.print(each + " ");
			
		}
		System.out.println("");
		
		System.out.println("for each loop dan sonraki elemanlar : " + sayiList );
		
		
		
	
		
		for (int i = 0; i < sayiList.size(); i++) {
			
			sayiList.set(i,sayiList.get(i) + 5);
			
		}
		
		System.out.println("for loopun içindeki liste : " + sayiList);
		
	}

}

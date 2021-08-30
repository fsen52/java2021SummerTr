package day47_Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class C1_LinkedList01 {

	public static void main(String[] args) {

		@SuppressWarnings("unused")
		List<String> liste = new ArrayList<>();
		
		LinkedList<String> ll1 = new LinkedList<>();
		
		ll1.add("A");
		ll1.add("B");
		
		ll1.add(1, "c");
		
	
		System.out.println(ll1);
		
	
	}

}

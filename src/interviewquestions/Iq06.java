package interviewquestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//import java.util.stream.IntStream;

public class Iq06 {

	public static void main(String[] args) {

		
		isMountain();
		
		
		
	}

	public static void isMountain() {
		
		int a[]= {0,2,5,3,1};
		
		//int max = IntStream.of(a).max().getAsInt();
		
		List<Integer> list = new ArrayList<>();
		
		Arrays.stream(a).forEach(t->list.add(t));
		
		
		int max = Arrays.stream(a).reduce(Integer.MIN_VALUE, Math::max);
		
		int maxIndex = list.indexOf(max);
		
		System.out.println(max);
		System.out.println(maxIndex);
		
		
		
		List<Integer> part1 = new ArrayList<>();
		list.stream().filter(t->list.indexOf(t)<= maxIndex).forEach(t->part1.add(t));
		
		/*
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
	}
	
	
}

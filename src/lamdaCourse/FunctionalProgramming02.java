package lamdaCourse;

import java.util.ArrayList;
import java.util.List;

public class FunctionalProgramming02 {

	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<Integer>();
		
		l.add(12);
		l.add(9);
		l.add(13);
		l.add(4);
		l.add(9);
		l.add(2);
		l.add(4);
		l.add(12);
		l.add(15);
		
		
		printElFunctional(l);
	}
	
	public static void printElFunctional(List<Integer> l) {
		System.out.println("printElFunctional");
		l.
		 stream().
		 forEach(Utils::printInTheSameLineWithASpace);

			
	}

	
	
}

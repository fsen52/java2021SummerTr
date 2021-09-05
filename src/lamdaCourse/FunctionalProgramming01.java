package lamdaCourse;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FunctionalProgramming01 {

	public static void main(String[] args) {

		/*
		 * Lambda is Functional Programming, Functional Programming was added to Java in
		 * Java 8, Structured Programming focuses on "How to do" most of times,
		 * Functional Programming focuses on "What to do", Functional Programming is
		 * used with Collections and Arrays
		 * 
		 */

		List<Integer> l = new ArrayList<Integer>();

		l.add(12);
		l.add(9);
		l.add(13);
		l.add(4);
		l.add(154);
		l.add(2);
		l.add(-3);
		l.add(12);
		l.add(15);
		l.add(10);
		l.add(14);

		System.out.println("List");
		// ****************************************************
		System.out.println(l);
		// ****************************************************
		System.out.println();
		// ****************************************************
		printElStructered(l);
		// ****************************************************
		System.out.println("\n");
		// ****************************************************
		printElFunctional(l);
		// ****************************************************
		System.out.println("\n");
		// ****************************************************
		printEvenEl(l);
		// ****************************************************
		System.out.println("\n");
		// ****************************************************
		printSquareOfOdds(l);
		// ****************************************************
		System.out.println("\n");
		// ****************************************************
		printCubeOfDistinctOdds(l);
		// ****************************************************
		System.out.println("\n");
		// ****************************************************
		sumSquareDistinctofEven(l);
		// ****************************************************
		System.out.println("\n");
		// ****************************************************
		productCubeOfDistinctEven(l);
		// ****************************************************
		System.out.println("\n");
		// ****************************************************
		getMaxElement(l);
		// ****************************************************
		System.out.println("\n");
		// ****************************************************
		getMinElement(l);
		// ****************************************************
		System.out.println("\n");
		// ****************************************************
		getMaxElement2(l);
		// ****************************************************
		System.out.println("\n");
		// ****************************************************
		getMinElement2(l);
		// ****************************************************
		System.out.println("\n");
		// ****************************************************
		greaterMinSevenAndEven(l);
		// ****************************************************
		System.out.println("\n");
		// ****************************************************
		greaterMinSevenAndEven2(l);

	}

	public static void printElStructered(List<Integer> l) {
		System.out.println("printElStructered");
		for (Integer w : l) {

			System.out.print(w + " ");

		}

	}

	public static void printElFunctional(List<Integer> l) {
		System.out.println("printElFunctional");
		l.stream().forEach(t -> System.out.print(t + " "));

	}

	public static void printEvenEl(List<Integer> l) {
		System.out.println("printEvenEl");
		l.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.print(t + " "));

	}

	public static void printSquareOfOdds(List<Integer> l) {
		System.out.println("printSquareOfOdds");
		l.stream().filter(t -> t % 2 != 0).map(t -> t * t).forEach(t -> System.out.print(t + " "));

	}

	public static void printCubeOfDistinctOdds(List<Integer> l) {
		System.out.println("printCubeOfDistinctOdds");
		l.stream().distinct().filter(t -> t % 2 != 0).map(t -> t * t * t).forEach(t -> System.out.print(t + " "));

	}

	public static void sumSquareDistinctofEven(List<Integer> l) {
		System.out.println("sumSquareDistinctofEven");
		Integer sum = l.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t).reduce(0, (t, u) -> t + u);
		System.out.println(sum);

	}

	public static void productCubeOfDistinctEven(List<Integer> l) {
		System.out.println("productCubeOfDistinctEven");
		Integer product = l.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t * t).reduce(1, (t, u) -> t * u);
		System.out.println(product);

	}

	public static void getMaxElement(List<Integer> l) {
		System.out.println("getMaxElement");
		Integer maxEL = l.stream().reduce(Integer.MIN_VALUE, (t, u) -> t < u ? u : t);
		System.out.println(maxEL);
	}

	public static void getMaxElement2(List<Integer> l) {
		System.out.println("getMaxElement2");
		Integer maxEL2 = l.stream().sorted().reduce(Integer.MIN_VALUE, (t, u) -> u);
		System.out.println(maxEL2);
	}

	public static void getMinElement(List<Integer> l) {
		System.out.println("getMinElement");
		Integer minEL = l.stream().reduce(Integer.MAX_VALUE, (t, u) -> t > u ? u : t);
		System.out.println(minEL);
	}

	public static void getMinElement2(List<Integer> l) {
		System.out.println("getMinElement2");
		Integer minEL2 = l.stream().sorted(Comparator.reverseOrder()).reduce(Integer.MAX_VALUE, (t, u) -> u);
		System.out.println(minEL2);
	}

	public static void greaterMinSevenAndEven(List<Integer> l) {
		System.out.println("greaterMinSevenAndEven");
		Integer el = l.stream().sorted(Comparator.reverseOrder()).filter(t -> t % 2 == 0 && t > 7)
				.reduce(Integer.MAX_VALUE, (t, u) -> t < u ? t : u);
		System.out.println(el);

	}

	public static void greaterMinSevenAndEven2(List<Integer> l) {
		System.out.println("greaterMinSevenAndEven2");
		Integer el = l.stream().sorted().filter(t -> t % 2 == 0 && t > 7).findFirst().get();
		System.out.println(el);

	}

}

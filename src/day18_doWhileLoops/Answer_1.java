package day18_doWhileLoops;

public class Answer_1 {

	public static void main(String[] args) {

		// Soru 1 ) 9 den 190 e kadar 7 nin kati olan tum tamsayilari ekrana yazdiriniz.

		int sayi = 9;

		do {

			System.out.println(sayi);

			sayi += 7;

		} while (sayi <= 190);

	}

}

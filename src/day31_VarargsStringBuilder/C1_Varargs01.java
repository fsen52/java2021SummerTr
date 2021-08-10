package day31_VarargsStringBuilder;

public class C1_Varargs01 {

	public int num1 = 10;
	
	public String name = "Furkan";
	
	
	public static void main(String[] args) {

		int sayi1 = 10;
		int sayi2 = 20;

		toplama(sayi1, sayi2);

		toplam(2, 3, 4, 5, 6);

	}

	public static void toplam(int... i) {

		int sonuc = 0;

		for (int j : i) {

			sonuc += j;

		}

		System.out.println("varargs sonucu : " + sonuc);
	}

	public static void toplama(int sayi1, int sayi2) {

		System.out.println(sayi1 + sayi2);

	}

}

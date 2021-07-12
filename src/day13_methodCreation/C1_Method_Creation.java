package day13_methodCreation;

public class C1_Method_Creation {

	public static void main(String[] args) {
		//System.out.println(toplama(20,40));
		int sonuc = toplama(15,25);
		
		System.out.println(sonuc);
		
	}

	public static int toplama (int sayi1, int sayi2) {
		
		System.out.println("gövde");
		return sayi1+sayi2;
	}
	
	
}

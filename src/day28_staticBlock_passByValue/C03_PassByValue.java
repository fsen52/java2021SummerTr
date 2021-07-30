package day28_staticBlock_passByValue;

public class C03_PassByValue {

	public static void main(String[] args) {

		double fiyat = 100 ;
		
		System.out.println("methodla çağrılan fiyat : " + indirimYap(fiyat));
		
		System.out.println("normal fiyat : " + fiyat );
		
		
	}
		
		private static double indirimYap(double ücret) { // %10 indirim yapacak, yeni fiyatı döndürecek
		
		ücret = ücret * (double)9/10;
		
		return ücret ;
		
		
		
	}
		
		
		
	}



package day28_staticBlock_passByValue;

public class C01_StaticBlocks {

	static int sayi = 10;
	
	static {
		
		System.out.println("static block calisti");
		
		sayi = 20;
	}
	
	
	
	public static void main(String[] args) {
		
		
		System.out.println("main methodun ilk satırında sayi = " +  sayi);

		
		
	}

}

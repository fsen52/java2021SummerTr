package day05_Wrapper_Concatenation;

public class C01_WrapperClass {

	public static void main(String[] args) {

		Integer sayi = 1;
		
		int max = Integer.MAX_VALUE;
		
		System.out.println(max);
		
		Short sayi2 = 1;
		
		int min2 = Short.MIN_VALUE;
		
		System.out.println(min2);
		System.out.println(Short.MIN_VALUE);
		
		String okulNo = "897";
		
		int value = Integer.parseInt(okulNo);
		
		System.out.println(value);
		
		Character basHarf = 'a';
		
		System.out.println(basHarf.charValue());
		
		System.out.println(sayi + sayi2);
		

	}

}

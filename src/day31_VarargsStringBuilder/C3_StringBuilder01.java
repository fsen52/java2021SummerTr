package day31_VarargsStringBuilder;

public class C3_StringBuilder01 {

	public static void main(String[] args) {

		StringBuilder data1 = new StringBuilder();
		
		StringBuilder data2 = new StringBuilder("bu ne iş");
		
		System.out.println("ilk satır : " + data1);
		
		System.out.println("ikinci satır : " + data2);
		
		data2.append("la");
		
		System.out.println("ikinci satır : " + data2);
		 
		System.out.println(data2.capacity());
		
		System.out.println(data2.length());
		
		data1.append("bu me iş"); 
		
		
		System.out.println("bu satır : " + data2.compareTo(data1));
		
	}

}

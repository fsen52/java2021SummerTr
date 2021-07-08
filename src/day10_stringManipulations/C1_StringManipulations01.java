package day10_stringManipulations;

public class C1_StringManipulations01 {

	public static void main(String[] args) {

		String name1 = "Ali Can";
		String name2 = "Ali Can";
		String name3 = name2 + "";
		String name4 = "Ali";
		String name5 = "Can";
		String name6 = name4 + " " + name5;
		
		
		System.out.println(name1.equals(name2));
		System.out.println(name1.equals(name3));
		System.out.println(name2.equals(name6));
	
		System.out.println("");
		
		System.out.println(name1 == name2);
		System.out.println(name1 == name3);
		System.out.println(name2 == name6);
	
		System.out.println("");
		
		System.out.println(name1.equalsIgnoreCase("alI cAN"));
	
	}
}

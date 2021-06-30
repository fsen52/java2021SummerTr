package day03_datacasting_increment;

public class Homework {

	public static void main(String[] args) {
		
	//Question 1
		
		byte value1 = 16 ;
		
		short value2 = value1;
		
		int value3 = value2;
		
		float value4 = value3 ;
		
		double value5 = value4 ;
		
		System.out.println(value1 +" "+value2+" "+value3+" "+value4+" "+value5+"\n");
		
	//Question 2
		
		int valu1 = 15;
		
		short valu2 = (short)valu1;
		
		byte valu3 = (byte)valu2;
		
		System.out.println(valu1 + " " + valu2 + " " + valu3 + "\n");
		
	//Question 3
		
		float val = 12.123f;
		
		System.out.println(val + "\n");
		
	//Question 4
		
		double va1 = 255.36;
		
		int va2 = (int)va1;
		
		byte va3 = (byte)va2;
		
		System.out.println(va1 + " " + va2 +" " + va3 + "\n");
		
	//Question 5
		
		System.out.println(value3 / valu1 + "\n");
		
	//Question 6
		
		System.out.println(value3 / va1 + "\n");
		
	//Question 7
		
		int k = va3*value2;
		
		short l = 2;
		
		byte m = 1;
		
		double n = m*l;
		
		System.out.println(k + " " + n + " " + m*l);
		
		
	}
	

}

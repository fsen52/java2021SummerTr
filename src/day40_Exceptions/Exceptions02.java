package day40_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions02 {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("C:\\Users\\Furkan\\git\\java2021SummerTr\\src\\day39_Exceptions\\Other File");
		
		int k = 0;
		
		while((k=fis.read())!=-1) {
			
			System.out.print((char)k);
			
		}
		
	}

}

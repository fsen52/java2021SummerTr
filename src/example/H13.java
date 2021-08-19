
package example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class H13 {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream(
					"C:\\Users\\Furkan\\git\\java2021SummerTr\\src\\day39_Exceptions\\Other File");
		
		try {

//			for(int i=0; i<200; i++) {
//				
//				System.out.print((char)fis.read());
//			}
			
		while (true) {
			
			System.out.println((char)(fis.read()));
			
		}


		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}

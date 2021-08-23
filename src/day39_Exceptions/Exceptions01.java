package day39_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions01 {

	public static void main(String[] args) {
int k=0;
		try {
			
			FileInputStream fis = new FileInputStream("C:\\Users\\Furkan\\git\\java2021SummerTr\\src\\day39_Exceptions\\Other File");
		
			try {
				while((k=fis.read())!=-1) {
				
				System.out.print((char)k);
				
				}
				
			} catch (IOException e) {

				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		
		
		}
		
		 
	}
	
}


	


package example;

import java.util.*;

public class Other {

	 public static void main(String[] args) {
		    
		    Scanner scan = new Scanner(System.in);
		    String guestList="";
		    String guestName;
		    
		    do{ 

		      System.out.println("Please enter guest name:");
		      guestName=scan.next();
		      guestList=guestList+ ", " + guestName;
		      System.out.println("Do you want to enter new guest name:");
		      guestName=scan.next();

		    }while(!guestName.equals("no"));
		
	}
}

package Java_Practice;

import java.util.*;

public class Square_Float {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		float x,y,square;
		
		System.out.println("Enter the 1st number");
	 
		 x = in.nextFloat();
		 
	   System.out.println("Enter the 2nd number");

	   y=in.nextFloat();
	   
	   square=x*y;
	   
	   System.out.println("The square of "+x+" and "+y+" is " +square);
	}

}

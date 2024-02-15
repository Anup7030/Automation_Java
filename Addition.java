package Java_Practice;

import java.util.*;

public class Addition {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int Add,x,y;
		
		System.out.println("Enter the 1st number");
		
		x=in.nextInt();
		
		System.out.println("Enter the 2nd number");
		
		y=in.nextInt();
		
		Add = x+y;
		
	  System.out.println("Addition of "+x+" and "+y+" is " +Add);

	}

}

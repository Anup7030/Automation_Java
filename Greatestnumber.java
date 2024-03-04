package Java_Practice;

import java.util.Scanner;

public class Greatestnumber {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the 1st number");
		int x= in.nextInt();
		System.out.println("Enter the 2nd number");
	    int y=in.nextInt();
	    System.out.println("Enter the 3rd number");
	    int z=in.nextInt();
	    
	    if(x>y)
	    {
	    	if(x>z) 
	    		System.out.println("Max "+x);
	    	else
	    		System.out.println("Max "+z);
	    	}
	    else
	    {
	    	if(y>z)
	    		System.out.println("Max "+y);
	    	else
	    		System.out.println("Max "+z);
	    }

	}

}

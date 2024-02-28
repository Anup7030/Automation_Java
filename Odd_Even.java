package Java_Practice;

import java.util.*;

public class Odd_Even {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        int num;
        
        System.out.println("Enter the number");
        
        num=in.nextInt();
        
        if(num%2==0)
        {
        	System.out.println("The number is even number");
        }
        else
        {
        	System.out.println("The number is odd number");
        }
	}

}

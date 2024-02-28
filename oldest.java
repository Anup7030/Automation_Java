//Write a program to check whether a number is divisible by 5 and 11 or not
package Java_Practice;

import java.util.*;

public class oldest {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int x;
		
		System.out.println("Enter the number");
		
		x=in.nextInt();
		
		if(x%5==0 && x%11==0)
			
		{
			System.out.println("The number "+x+ " is divisible by 5 and 11");
		}
		else
		{
			System.out.println("The number "+x+" is not divisible by 5 and 11");
		}
		

	}

}

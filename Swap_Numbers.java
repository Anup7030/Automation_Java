package Java_Practice;

import java.util.Scanner;

public class Swap_Numbers {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x,y,temp;
		System.out.println("Enter the 1st numbers");
		
		x=in.nextInt();
		
		System.out.println("Enter the 2nd number");
		
		y=in.nextInt();
		
		System.out.println("The number before swapping "+x +" and "+y);
		
		temp=x;
		
		x=y;
		
		y=temp;
		
		System.out.println("After sawoing the number is:-"+x+ " and " +y);
		
		
	}

}

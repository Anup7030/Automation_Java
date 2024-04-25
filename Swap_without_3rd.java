package Java_Practice;

import java.util.Scanner;

public class Swap_without_3rd {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		int x,y;
		System.out.println("Enter the 1st number");
		x=in.nextInt();
		
		System.out.println("Enter the 2nd number");
		y=in.nextInt();
		
		System.out.println("The nuber before swaping"+x+"and"+y);
		
		
		x=x+y;
		
		y=x-y;
		
		x=x-y;
		
		System.out.println("The number after swaping is:-"+x+ "and"+y);
	}

}

package Java_Practice;

import java.util.Scanner;

public class Positive_Negative {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int n;
		
		System.out.println("Enter the number");
		
		n=in.nextInt();
		
		if(n>0)
		{
			System.out.println(n+" is Positive number");
		}
		else
		{
			System.out.println(n+" is negative number");
		}
	}

}

package Java_Practice;

import java.util.*;

public class check {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the 1st number");
		int a=in.nextInt();
		System.out.println("Enter the 2nd number");
		int b=in.nextInt();
		
		if(a==b) {
			System.out.println("The number is euqal");
		} else if(a>b) {
			System.out.println("The a is grater");
		} else {
			System.out.println("The a is lesser");
		}

	}

}

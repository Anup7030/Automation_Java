//Write a Java program that takes two numbers as input and displays the product of two numbers.
package Java_Practice;

import java.util.*;

public class Product_numbers {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		double n1,n2,Product;
		
		System.out.println("Enter the 1st number");
		
		n1=in.nextDouble();
		
		System.out.println("Enter the 2nd number");
		n2=in.nextDouble();
		
		Product= n1*n2;
		
		System.out.println("The product of "+n1+" and "+n2+" is:-" +Product);
	
	}

}

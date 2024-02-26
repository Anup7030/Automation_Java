//Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.

package Java_Practice;

import java.util.*;

public class A_O {

	public static void main(String[] args) {
		
       Scanner in = new Scanner(System.in);
       
       double n1,n2,sum,multiply,subtract,divide,remainder;
       
       System.out.println("Enter the 1st number");
       
       n1=in.nextDouble();
       
       System.out.println("Enter the 2nd number");
       
       n2=in.nextDouble();
       
       sum= n1+n2;
       
       System.out.println("The sum of two number is:- "+sum);
       
       subtract=n1-n2;
       
       System.out.println("The subtract of two number is:- "+subtract);
       
       divide=n1/n2;
       
       System.out.println("The divide of two number is:- "+divide);
       
       multiply=n1*n2;
       
       System.out.println("The multiplication of two number is:-"+multiply);
       
       remainder=n1%n2;
       
       System.out.println("The remainder of two number is:- "+remainder);
	}

}

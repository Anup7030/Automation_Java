package Java_Practice;

import java.util.Arrays;
import java.util.Scanner;

public class arrayelement {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the element u want to store");
	       int Size=in.nextInt();
	       
	       int[] array= new int[10];
	       
	       System.out.println("Enter the element of array");
	       
	       for(int i=0;i<Size;i++) {
	    	   //reading array elements from the user
	    	   array[i]=in.nextInt();
	       }
           System.out.println("Array elements are");
           for(int i=0;i<Size;i++) {
        	   System.out.print(array[i] + " ");
           }
	}

}

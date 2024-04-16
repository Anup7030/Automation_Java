package Java_Practice;

import java.util.*;



public class arrayreversed {
	
	public static void main(String[] args){
		
		Object reverserArrayusingScanner;
		
	}

	public static void reverseArrayUsingScanner(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the array of size");
		
		int n=in.nextInt();
		
	   int[] array=new int[10];
	   
	   System.out.println("Enter the array Element");
	   for(int i=0;i<n;i++) {
		   array[i]=in.nextInt();
		  
	   }
       System.out.println("The original array is");
       for(int i=0;i<n;i++) {
    	   System.out.print(array[i] + " ");
       }
           in.close();   
	
	}

	
		

}

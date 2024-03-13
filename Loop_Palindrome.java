package Java_Practice;

import java.util.Scanner;

public class Loop_Palindrome {

	public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       
       System.out.println("Enter the number");
       int number=in.nextInt();
       
       int reverse=0;
       
       int originalNumber=number;
       for(int i=number;i !=0;i /=10) {
    	   int digit = i % 10;
    	   reverse = reverse * 10 + digit;
       }
    	   if(originalNumber==reverse) {
    		   System.out.println("Number is palindrome");
    	   }
    		   else {
    			   System.out.println("Number is not Palindrome");
    		   }
    	   }
       }

       
       

	

	
	


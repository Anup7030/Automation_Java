package Java_Practice;

import java.util.Scanner;

public class Loops_Even {

	public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int n;
       System.out.println("Enter the number");
       n=in.nextInt();
       for(int i=0;i<=n;i++) {
    	   
    	   if(i%2==0) {
    		   System.out.println(i);
    	   }
    		   
    	   
       }
	}

}

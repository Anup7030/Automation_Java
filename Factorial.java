package Java_Practice;

import java.util.*;

public class Factorial {

	public static void main(String[] args) {
     Scanner in= new Scanner(System.in);
     int num;
     int fact=1;
     
     System.out.println("Enter the number");
     num=in.nextInt();
     
     for(int i=1;i<=num;i++) {
    	 fact=fact*i;
     }
       System.out.println("Factorial:-"+fact);

	}

}

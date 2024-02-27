package Java_Practice;

import java.util.*;

public class OE {

	public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        int num;
        
        System.out.println("Enter the number");
        
        num=in.nextInt();
        
        if(num%2==0)
        	
        	System.out.println(num+" is a Eeven number");
        
        if(num%2==1)
        	
        	System.out.println(num+" is a odd number");
	}

}

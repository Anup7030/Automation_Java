package Java_Practice;

import java.util.*;

public class Max_Min {
	
	       public static void main(String[] args) {

	        Scanner in = new Scanner(System.in);
	        
	        int num1,num2;
	        
	        System.out.println("Enter the number");
	        
	        num1=in.nextInt();
	        
            System.out.println("Enter the number");
	        
	        num2=in.nextInt();
	        
	        if(num1>num2)
	        	
	        	System.out.println(num1+" is a Maximun number");
	        
	        else
	        {
	        	
	        	System.out.println(num1+" is a Minimum number");
	        }
		}

	}
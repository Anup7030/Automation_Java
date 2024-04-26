package Java_Practice;

import java.util.Scanner;

public class Comapre_2_string {

	public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       
       String str1,str2;
       
       System.out.println("Enter the first string");
       
       str1=in.nextLine();
       
       System.out.println("Enter the second string");
       
       str2=in.nextLine();
       
       if(str1.compareTo(str2)>0) {
    	   System.out.println("The string first string is greater than second");
       }
       else if(str1.compareTo(str2)<0) {
    	   System.out.println("The string second string is greater than first");
       }
       else {
    	   System.out.println("The both string are equal");
       }
	}

}

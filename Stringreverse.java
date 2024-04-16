package Java_Practice;

import java.util.Scanner;

public class Stringreverse {

	public static void main(String[] args) {
	      Scanner in = new Scanner(System.in);
	     
	      System.out.println("Enter the String");
	      
	       String string=in.nextLine();
	       
	       String originalstring=string;
	       
	       String reversedstring="";
	       
	       for(int i=0;i<originalstring.length();i++) {
	    	   
	    	   reversedstring=originalstring.charAt(i)+reversedstring;
	    	   
	       }
	       
	       System.out.println("Reversed string is:- "+reversedstring +" ");
	}

}

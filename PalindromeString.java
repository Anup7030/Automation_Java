package Java_Practice;

import java.util.*;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter the string");
		
		String str=in.nextLine();
		
		String reverse=" ";
		
		for(int i=str.length()-1;i>0;i--) {
			
			char ch=str.charAt(i);
			reverse=reverse+ch;
			
		}
		if(str.equals(reverse))
			System.out.println(str+" Is palindrome");
		else
			System.out.println(str+" Is not palindrome");

	}

}

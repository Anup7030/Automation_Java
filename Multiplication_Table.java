package Java_Practice;

import java.util.*;

public class Multiplication_Table {

	public static void main(String[] args) {
		
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the number");
		int n=in.nextInt();
		
		for(int i=1;i<=10;i++) {
			
			System.out.println(n*i);
			
		}
		

	}

}

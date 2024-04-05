package Java_Practice;

import java.util.Scanner;

public class power {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int base;
		int power;
		int result=1;
		
		System.out.println("Enter the base number");
		
		base=in.nextInt();
		
		System.out.println("Enter the power number");
		
		power=in.nextInt();
		
		for(int i=1;i<=power;i++) {
			
			result=result*base;
		}
		
		System.out.println("Result:- "+result);

	}

}

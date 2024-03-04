package Java_Practice;

import java.util.Scanner;

public class DivdieInfo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number");
		int n=in.nextInt();
		if(n%7==0) {
			System.out.println("Number is divided by 7");
		}else
		{
			System.out.println("Number is not divided by 7");
		}
	}

}

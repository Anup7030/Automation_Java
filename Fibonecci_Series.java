package Java_Practice;

import java.util.Scanner;

public class Fibonecci_Series {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the count");
		int n=in.nextInt();
		int num1=0;int num2=1;int num3;
		System.out.print(num1+" "+num2);
		for(int i=2;i<=n;i++) {
			num3=num1+num2;
			System.out.print(" "+num3);
			num1=num2;
			num2=num3;
		}
		
	}

}

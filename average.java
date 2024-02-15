package Java_Practice;

import java.util.*;

public class average {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int n1,n2,n3;
		double Sum,avg;
		System.out.println("Enter the 1st number");
		
		n1=in.nextInt();
		
		System.out.println("Enter the 1st number");
		n2=in.nextInt();
		
		System.out.println("Enter the 1st number");
		n3=in.nextInt();
		
		//Sum=n1+n2+n3;
		
		avg=((n1+n2+n3)/3);
		
		
		System.out.println("The avg is:" + avg);
	}

}

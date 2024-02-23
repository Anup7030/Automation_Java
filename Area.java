package Java_Practice;

import java.util.*;

public class Area {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		System.out.println("Enter the length  rectangle");
		
		double length = in.nextDouble();
		
		System.out.println("Enter the breadth of rectangle");
		
		double breadth = in.nextDouble();
		
		double Area= length*breadth;
		
		System.out.println("The area of rectangle is "+Area);
	}

}

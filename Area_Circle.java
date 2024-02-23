package Java_Practice;

import java.util.*;

public class Area_Circle {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		int r;
		double  area;
		
		System.out.println("Enter the radius");
		
		r = in.nextInt();
		
		area = 3.142*r*r;
		
		System.out.println("The area of cicle is:- "+area);
		
	}

}

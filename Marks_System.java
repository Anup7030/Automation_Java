//It is a program of grading system for fail, D grade, C grade, B grade, A grade and A+.  
package Java_Practice;

import java.util.*;

public class Marks_System {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Marks");
		int Marks=in.nextInt();
		if(Marks<35) {
			System.out.println("Fail");
		}
		else if(Marks>=50 && Marks<=60) {
			System.out.println("D grade");
		}
		else if(Marks>=60 && Marks<=70) {
			System.out.println("c grade");
		}
		else if(Marks>=70 && Marks<=80) {
			System.out.println("B grade");
		}
		else if(Marks>=80 && Marks<=100) {
			System.out.println("A+ grade");
		}else
		{
			System.out.println("Invalid");
		}
		
	}

}

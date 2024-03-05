package Java_Practice;

import java.util.*;

public class switch_condition {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number");
		int N=in.nextInt();
		
		switch(N) {
		case 1 : System.out.println("Excellent");
		break;
		case 2 : System.out.println("Good");
		break;
		case 3 : System.out.println("Fair");
		break;
		case 4 : System.out.println("Fail");
		break;
		default : System.out.println("Invalid Input");
		}
	}

}

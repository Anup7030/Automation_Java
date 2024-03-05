package Java_Practice;

import java.util.*;

public class condition {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Button");
		
		int Button=in.nextInt();
		
		if(Button==1) {
			System.out.println("Hello");
		}else if(Button==2) {
			System.out.println("Namste");
		}else if(Button==3) {
			System.out.println("Bonjour");
		}else {
			System.out.println("Invalid button");
		}

	}

}

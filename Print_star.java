//Print Star console using Loop
package Java_Practice;

import java.util.Scanner;

public class Print_star {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n=in.nextInt();
		 
		 for (int i= 1;i<=n;i++) {
		 
			 for(int j= 1;j<=i;j++) {
		 
				 System.out.print("*");
		 }
		 
			 System.out.println(); 
 
		 }
	}
}



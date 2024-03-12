//Print the su of natural number
package Java_Practice;

import java.util.Scanner;

public class Loop_sum {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int i,n,sum=0;
		System.out.println("Enter the number");
		
		n=in.nextInt();
		
		for(i=1;i<=n;i++) {
			sum=sum+i;
		}
		
		System.out.println("Sum= "+sum);

	}

}

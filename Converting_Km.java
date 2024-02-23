package Java_Practice;

import java.util.*;

public class Converting_Km {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double Meter,Kilometer;
		
		System.out.println("Enter the kilometer value for converted kilometer to Meter");

		Kilometer=in.nextDouble();
		Meter=Kilometer*1000;
		
		System.out.println(Kilometer+ " Kilometer is equal to the " + Meter + " meter");
	}


}

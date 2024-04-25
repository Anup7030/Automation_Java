package Java_Practice;

import java.util.Scanner;

public class FahrenittoCelsius {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double Temperatue;
		System.out.println("Enter the temperatue in fahrenit");
		
		int temperatue=in.nextInt();
		
		Temperatue =((temperatue-32)*5)/9;
		
		System.out.println("The temperatue fahrenit to Celsius is:-"+Temperatue);
	}

}

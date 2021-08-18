package basicPrograms;

import java.util.Scanner;

// Java program to check whether a number is even or odd
public class CheckEvenOrOdd {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter any number: ");
		int num = scan.nextInt();
		
		if (num % 2 == 0)
			System.out.println("EVEN");
		else
			System.out.println("ODD");
		
		scan.close();
	}
}

package arrays;

import java.util.Scanner;

// Java program to take an input from the users, print the data inputs and update the data elements of an array
public class InputOutputUpdate {

	public static void main(String[] args) {
		
		// Creating an array
		int[] marks = new int[50];
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of marks you want to store? ");
		int n = scan.nextInt();
		
		// input
		for (int i = 0; i < n; i++) {
			marks[i] = scan.nextInt();
			
			// updating the marks that an user entered
			marks[i] *= 2;
		}
		
		// output
		System.out.println("Marks Obtained : ");
		for (int i = 0; i < marks.length; i++) {
			System.out.print(marks[i] + " ");
		}
		
		// closing the input stream
		scan.close();
	}
}

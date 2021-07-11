package arrays.two_dimensional_array;

import java.io.PrintWriter;
import java.io.StringWriter;

import fastIO.BasicIO;

// Java program to traverse a 2-D array
public class Traverse {
	
	// reading a 2-D array from the users
	public static void inputArray(int[][] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print("arr[" + i + "][" + j + "] = ");
				arr[i][j] = BasicIO.nextInt();
			}
		}
	}
	
	// printArray() to print a 2-D array
	public static void printArray(int[][] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	// update() to update any element from a 2-D array
	public static void update(int[][] arr) {
		
		arr[2][1] = 0;
	}

	// driver method
	public static void main(String[] args) {
		
		try {
			System.out.print("Enter the number of rows: ");
			int rows = BasicIO.nextInt();
			System.out.print("Enter the number of cols: ");
			int cols = BasicIO.nextInt();
			
			// Creating an array
			int[][] arr = new int[3][3];
			
			// taking the input from the user
			inputArray(arr);
			
			// printing an array
			System.out.println("\nOriginal Array: ");
			printArray(arr);
			
			update(arr);
			System.out.println("Array after updation: ");
			printArray(arr);
		}
		catch (Exception ex) {
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			ex.printStackTrace(pw);
			String error = sw.toString();
			System.out.println("Error : \n" + error);
		}
	}
}





package arrays.three_dimensional_array;

import java.io.PrintWriter;
import java.io.StringWriter;

import fastIO.BasicIO;

// Java program to traverse a three dimensional array
public class Traverse {
	
	// inputArray() to read an array from a user
	public static void inputArray(int[][][] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = 0; k < arr[i][j].length; k++) {
					System.out.print("arr[" + i + "][" + j + "][" + k + "] : ");
					arr[i][j][k] = BasicIO.nextInt();
				}
			}
		}
	}
	
	// print() to print a three dimensional array
	public static void print(int[][][] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = 0; k < arr[i][j].length; k++) {
					System.out.println("arr[" + i + "][" + j + "][" + k + "] : " + arr[i][j][k]);
				}
			}
		}
	}

	// driver method
	public static void main(String[] args) {

		try {
			// creating a three dimensional array
			int[][][] arr = new int[2][2][2];
			
			// inputArray()
			inputArray(arr);
			
			// printing array
			System.out.println("\nElements of an array are: ");
			print(arr);
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


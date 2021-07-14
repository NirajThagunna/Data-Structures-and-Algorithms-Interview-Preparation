package arrays.one_dimensional_array;

import java.io.PrintWriter;
import java.io.StringWriter;

import fastIO.ArrayIO;
import fastIO.BasicIO;

// Java program to demonstrate the jagged array
public class JaggedArray2 {

	public static void main(String[] args) {
		
		try {
			System.out.print("Enter the number of rows: ");
			int rows = BasicIO.nextInt();
			
			// Creating an array having fixed no of rows but no. of cols will be decided at the runtime
			int[][] arr = new int[rows][];
			
			// Assigning the size of each member arrays
			for (int i = 0; i < arr.length; i++) {
				arr[i] = new int[i + 1];
			}
			
			int count = 0;
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					arr[i][j] = count++;
				}
			}
			
			System.out.println("\nElements of an array are: ");
			ArrayIO.printArray(arr);
			
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

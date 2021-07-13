package matrix;

import java.io.PrintWriter;
import java.io.StringWriter;

import fastIO.ArrayIO;

// Java program to add two matrices
// Matrix Addition
public class AdditionOfTwoMatrix {

	// addition() to add two matrices
	public static void addition(int[][] matrix1, int[][] matrix2) {
		
		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1[i].length; j++) {
				matrix1[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}
		
		// printing the resultant matrix
		System.out.println("\nAddition of two matrices is: ");
		
		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1[i].length; j++) {
				System.out.print(matrix1[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	// driver method
	public static void main(String[] args) {

		try {
			
			// First Matrix
			int[][] matrix1 = new int[3][3];
			
			// Second Matrix
			int[][] matrix2 = new int[3][3];
			
			// reading the data elements of both the matrices
			System.out.println("********** Reading the first matrix ************");
			ArrayIO.readArray(matrix1);
			System.out.println("\n********** Reading the second matrix *************");
			ArrayIO.readArray(matrix2);
			
			// Adding two matrices
			addition(matrix1, matrix2);
			
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

// Time Complexity: O(n^2)
// Space Complexity: O(1)



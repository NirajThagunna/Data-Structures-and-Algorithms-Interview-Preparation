package matrix;

import java.io.PrintWriter;
import java.io.StringWriter;

import fastIO.ArrayIO;
import fastIO.BasicIO;

// Java program to multiply two matrices
// Matrix Multiplication
public class MatrixMultiplication {

	// multiplication() to multiply two matrices
	public static int[][] multiplication(int[][] matrix1, int[][] matrix2, int rows, int cols) {
		
		int[][] temp = new int[rows][cols]; // temp array to store the result
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				
				temp[i][j] = 0;
				for (int k = 0; k < cols; k++) {
					temp[i][j] += matrix1[i][k] * matrix2[k][j];
				}
			}
		}
		
		return temp;
	}
	
	// Driver method
	public static void main(String[] args) {
		
		try {
			System.out.print("Enter the number of rows: ");
			int rows = BasicIO.nextInt();
			System.out.print("Enter the number of cols: ");
			int cols = BasicIO.nextInt();
			
			// Creating two matrices
			int[][] matrix1 = new int[rows][cols];
			int[][] matrix2 = new int[rows][cols];
			
			// Reading the data elements
			System.out.println("\n************ Reading First Matrix ************");
			ArrayIO.readArray(matrix1);
			
			System.out.println("\n************ Reading Second Matrix ************");
			ArrayIO.readArray(matrix2);
			
			// Multiplication of two matrices
			System.out.println("\nMatrix Multiplication: ");
			ArrayIO.printArray(multiplication(matrix1, matrix2, rows, cols));
			
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

// Time Complexity: O(n^3)
// Space Complexity: O(n)





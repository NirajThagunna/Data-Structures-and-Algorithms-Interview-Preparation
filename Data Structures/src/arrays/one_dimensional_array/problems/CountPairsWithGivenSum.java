package arrays.one_dimensional_array.problems;

import java.io.PrintWriter;
import java.io.StringWriter;

import fastIO.ArrayIO;
import fastIO.BasicIO;

// Java program to count the pairs of the numbers with given sum in the array
// Naive Solution – A simple solution is to traverse each element and check if there’s another number in the array which 
// can be added to it to give sum. 
public class CountPairsWithGivenSum {
	
	// count() method to count the pairs of the numbers with given sum in the array
	public static int countPairs(int[] arr, int sum) {
		
		int count = 0;
		
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				
				if (arr[i] + arr[j] == sum) {
					count++;
				}
			}
		}
		
		return count;
	}

	// Driver Method
	public static void main(String[] args) {

		try {
			System.out.print("Enter the size of an array: ");
			int n = BasicIO.nextInt();
			
			// Creating an array
			int[] arr = ArrayIO.readArray(n);
			
			// Printing an array
			System.out.println("\nElements of an array are: ");
			ArrayIO.printArray(arr);
			
			// sum
			System.out.print("\nEnter the sum: ");
			int sum = BasicIO.nextInt();
			
			int count = countPairs(arr, sum);
			System.out.println("\nTotal number of the pairs: " + count);
			
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
// Auxiliary Space: O(1)


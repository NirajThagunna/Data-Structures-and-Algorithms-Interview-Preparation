package arrays.one_dimensional_array.problems;

import java.io.PrintWriter;
import java.io.StringWriter;

import fastIO.ArrayIO;
import fastIO.BasicIO;

// Java program to find the minimum and maximum in the array
public class MinimumAndMaximum {
	
	// min() to find the minimum element of the array
	public static int min(int[] arr) {
		
		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		
		return min;
	}
	
	// max() to find the maximum of the array
	public static int max(int[] arr) {
		
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		
		return max;
	}

	// driver method
	public static void main(String[] args) {
		
		try {
			System.out.print("How many elements do you want to store? ");
			int MAX = BasicIO.nextInt();
			
			// Creating an array
			int[] arr = ArrayIO.readArray(MAX);
			
			// Printing an array
			System.out.println("\nElements of an array are: ");
			ArrayIO.printArray(arr);
			
			System.out.println("\nMinimum element is: " + min(arr));
			System.out.println("\nMaximum element is: " + max(arr));
			
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

// Time Complexity: O(n)


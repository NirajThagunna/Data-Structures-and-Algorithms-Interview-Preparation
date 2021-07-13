package arrays.one_dimensional_array.problems;

import java.io.PrintWriter;
import java.io.StringWriter;

import fastIO.ArrayIO;
import fastIO.BasicIO;

// Java program to find the second largest element from an array
public class SecondLargestElement {

	// findSecondLargestElement() to find the second largest element of an array
	public static int findSecondLargestElement(int[] arr) {
		
		for (int j = 1; j < arr.length; j++) {
			
			int temp = arr[j];
			int i = j - 1;
			
			while (i >=0 && arr[i] > temp) {
				arr[i + 1] = arr[i];
				i--;
			}
			
			arr[i + 1] = temp;
		}
		
		// returning the second largest element after sorting an array
		return arr[arr.length - 2];
	}
	
	// Driver method
	public static void main(String[] args) {

		try {
			System.out.print("Enter the size of an array: ");
			int n = BasicIO.nextInt();
			
			// Creating an array
			int[] arr = ArrayIO.readArray(n);
			
			// Printing an array
			System.out.println("\nOriginal Array: ");
			ArrayIO.printArray(arr);
			
			// finding the second largest element
			System.out.println("\nSecond largest element is: " + findSecondLargestElement(arr));
			
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


// Time Complexity: O(n) in Best Case and O(n^2) in Worst Case
// Auxiliary Space: O(1)




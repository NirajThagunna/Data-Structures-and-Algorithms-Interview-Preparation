package searching;

import java.io.PrintWriter;
import java.io.StringWriter;

import fastIO.ArrayIO;
import fastIO.BasicIO;

// Binary Search Algorithm Implementation Recursively
// Recursive Method
public class BinarySearchRecursive {

	// binarySearch() method to search an element
	public static int binarySearch(int[] arr, int data, int low, int high) {

		if (low <= high) {

			int mid = low + (high - low) / 2;

			if (data == arr[mid])
				return mid;

			else if (data < arr[mid])
				return binarySearch(arr, data, low, mid - 1);

			else // data > arr[mid]
				return binarySearch(arr, data, mid + 1, high);
		}

		// if the element is not found then, return -1
		return -1;
	}

	// main() method
	public static void main(String[] args) {
		try {
			System.out.println("******* Binary Search Algorithm - Recursively *********");
			System.out.print("How many elements do you want to store? ");
			int MAX = BasicIO.nextInt();

			// Creating an array
			int[] arr = ArrayIO.readArray(MAX);

			// printing an array
			System.out.println("\nElements of an array are : ");
			ArrayIO.printArray(arr);

			// Data element to be searched
			System.out.print("\nEnter the element to be search : ");
			int data = BasicIO.nextInt();

			// binarySearch()
			int result = binarySearch(arr, data, 0, arr.length - 1);
			if (result == -1) 
				System.out.println("\n" + data + " is not found!");
			else 
				System.out.println("\n" + data + " is present at position " + (result + 1));
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

/*
 * Time Complexity : O(log n)
 * 
 * Best Case Time Complexity : O(1) -> If the element is present at mid i.e. only one comparison
 * Worst Case Time Complexity : Big-Theta of log n 
 * 
 * Space Complexity : O(log n) because the recursive method uses the stack memory
*/






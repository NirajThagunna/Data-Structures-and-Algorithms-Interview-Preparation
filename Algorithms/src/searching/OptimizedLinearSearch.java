package searching;

import java.io.PrintWriter;
import java.io.StringWriter;

import fastIO.ArrayIO;
import fastIO.BasicIO;

/*
 * @Author: Niraj Thagunna
 * 
 * Improve Linear Search Worst-Case Complexity
 * 		- if element Found at last  O(n) to O(1)
 * 		- if element Not found O(n) to O(n/2)
 */
public class OptimizedLinearSearch {

	// Optimized linearSearch()
	public static int linearSearch(int[] arr, int data) {

		int left = 0;
		int len = arr.length;
		int right = len - 1;
		int pos = -1;

		// use the for loop to divide an array into the two halves
		for (left = 0; left <= right; left++, right--) {

			// compare with the left most elements
			if (arr[left] == data) {
				pos = left;
				break;
			}

			// compare with the right most elements
			if (arr[right] == data) {
				pos = right;
				break;
			}
		}

		// return the position of an element
		return pos;
	}

	// main() method
	public static void main(String[] args) {
		try {
			System.out.println("******* Linear Searching Algorithm *******");
			System.out.print("How many elements do you want to store? ");
			int MAX = BasicIO.nextInt();

			// Reading an array
			int[] arr = ArrayIO.readArray(MAX);

			// printing an array
			System.out.println("\nElements of an array are : ");
			ArrayIO.printArray(arr);

			System.out.print("\nEnter the element you want to search : ");
			int data = BasicIO.nextInt();

			// call the linearSearch() method
			int result = linearSearch(arr, data);
			if (result == -1) {
				System.out.println("\n" + data + " is not found!");
			}
			else {
				System.out.println("\n" + data + " is present at position " + (result + 1));
			}

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




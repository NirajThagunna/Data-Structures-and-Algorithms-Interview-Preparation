package searching;

import java.io.PrintWriter;
import java.io.StringWriter;

import fastIO.ArrayIO;
import fastIO.BasicIO;

// Program to count the occurrence of an element using Binary Search Algorithm
public class CountOccurrenceOfAnElement {

	// method to find the first and last occurrence of an element
	public static int binarySearch(int[] arr, int data, boolean searchFirst) {

		int low = 0, high = arr.length - 1, pos = -1;

		while (low <= high) {

			int mid = low + (high - low) / 2;

			if (data == arr[mid]) {
				pos = mid;

				if (searchFirst)
					high = mid - 1;
				else 
					low = mid + 1;
			}
			else if (data < arr[mid]) {
				high = mid - 1;
			}
			else {
				low = mid + 1;
			}
		}

		// if the data element is not present in the array then, return -1
		return pos;
	}

	// main() method
	public static void main(String[] args) {
		try {
			System.out.println("******* Binary Search Algorithm - Count the occurrence of an element *********");
			System.out.print("How many elements do you want to store? ");
			int MAX = BasicIO.nextInt();

			// Creating an array
			int[] arr = ArrayIO.readArray(MAX);

			// printing an array
			System.out.println("\nElements of an array are : ");
			ArrayIO.printArray(arr);

			// Data element to be searched
			System.out.print("\nEnter the element whose occurrence do you want to count : ");
			int data = BasicIO.nextInt();

			// binarySearch()
			// find the first occurrence of an element
			int firstIndex = binarySearch(arr, data, true);
			if (firstIndex == -1) {
				System.out.println("\nThe occurrence of " + data + " is 0 times");
			}
			else {
				// Finding the last occurrence of an element
				int lastIndex = binarySearch(arr, data, false);
				System.out.println("\nThe occurrence of " + data + " is " + (lastIndex - firstIndex + 1) + " times");
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

// Time Complexity : O(log n)



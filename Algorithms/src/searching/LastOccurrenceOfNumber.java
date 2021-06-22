package searching;

import java.io.PrintWriter;
import java.io.StringWriter;

import fastIO.ArrayIO;
import fastIO.BasicIO;

// Program to find the last occurrence of an element using Binary Search Algorithm
public class LastOccurrenceOfNumber {

	// method to find the last occurrence of a number
	public static int binarySearch(int[] arr, int data) {

		int low = 0, high = arr.length - 1, pos = -1;

		while (low <= high) {

			int mid = low + (high - low) / 2;

			if (data == arr[mid]) {
				pos = mid;
				low = mid + 1;
			}
			else if (data < arr[mid]) {
				high = mid - 1;
			}
			else {
				low = mid + 1;
			}
		}

		// if the data element is not present in an array, then return -1
		return pos;
	}

	// main() method
	public static void main(String[] args) {
		try {
			System.out.println("******* Binary Search Algorithm - Last Occurrence Of an Element *********");
			System.out.print("How many elements do you want to store? ");
			int MAX = BasicIO.nextInt();

			// Creating an array
			int[] arr = ArrayIO.readArray(MAX);

			// printing an array
			System.out.println("\nElements of an array are : ");
			ArrayIO.printArray(arr);

			// Data element to be searched
			System.out.print("\nEnter the element whose last occurrence do you want to find : ");
			int data = BasicIO.nextInt();

			// binarySearch()
			int result = binarySearch(arr, data);
			if (result == -1) 
				System.out.println("\n" + data + " is not found!");
			else 
				System.out.println("\nThe last occurrence of " + data + " is at position " + (result + 1));
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





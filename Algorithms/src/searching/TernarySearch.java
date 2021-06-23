package searching;

import java.io.PrintWriter;
import java.io.StringWriter;

import fastIO.ArrayIO;
import fastIO.BasicIO;

// Ternary Search Algorithm Implementation
public class TernarySearch {

	// method to search an element using ternary search algorithm
	public static int ternarySearch(int[] arr, int low, int high, int data) {
		
		if (low <= high) {
			
			int mid1 = low + (high - low) / 3;
			int mid2 = high - (high - low) / 3;
			
			if (data == arr[mid1])
				return mid1;
			
			else if (data == arr[mid2])
				return mid2;
			
			else if (data < arr[mid1])
				return ternarySearch(arr, low, mid1 - 1, data);
			
			else if (data > arr[mid1] && data < arr[mid2])
				return ternarySearch(arr, mid1 + 1, mid2 - 1, data);
			
			else 
				return ternarySearch(arr, mid2 + 1, high, data);
		}
		
		// if the element is not present then, return -1
		return -1;
	}
	
	// main() method
	public static void main(String[] args) {
		try {
			System.out.println("******* Ternary Search Algorithm Implementation ********");
			System.out.print("Enter the size of an array : ");
			int MAX = BasicIO.nextInt();
			
			// Creating an array
			int[] arr = ArrayIO.readArray(MAX);
			
			// printing an array
			System.out.println("\nElements of an array are : ");
			ArrayIO.printArray(arr);
			
			System.out.print("\nEnter the element you want to search : ");
			int data = BasicIO.nextInt();
			
			// calling the ternarySearch() method
			int result = ternarySearch(arr, 0, arr.length - 1, data);
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

// Time Complexity : Θ(log3 n) -> Big-Theta of log n base 3
// Space Complexity : Θ(log3 n) -> Big-Theta of log n base 3 -> becoz it uses stack memory



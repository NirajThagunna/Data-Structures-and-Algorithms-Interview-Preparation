package searching;

import java.io.PrintWriter;
import java.io.StringWriter;

import fastIO.ArrayIO;
import fastIO.BasicIO;

/*
 * @Author: Niraj Thagunna
 * Linear Searching Algorithm || Sequential Searching Algorithm
 */
public class LinearSearch {

	// method to search an element - linearSearch()
	public static int linearSearch(int[] arr, int data) {
		
		// variable to store the position of an element if found
		int pos = -1;
		
		for (int i = 0; i < arr.length; i++) {
			
			// Compare the data to be found with every element of an array
			if (arr[i] == data) {
				pos = i;
				break;
			}
		}
		
		// return the position of an element to be search
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

/*
 * The time complexity of the linear search algorithm is O(n).
 * Worst Case Time Complexity : O(n)
 * Best Case Time Complexity : O(1)
 * Average Case Time Complexity : O((n + 1) / 2)
 * 
 * Space Complexity : O(1) i.e. constant amount of space
 */




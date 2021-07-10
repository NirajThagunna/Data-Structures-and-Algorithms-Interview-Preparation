package arrays.one_dimensional_array;

import java.io.PrintWriter;
import java.io.StringWriter;

import fastIO.ArrayIO;
import fastIO.BasicIO;

// Java program to update an element from an array
public class Updation {

	// binarySearch() to search an element from an array and return the index of that element
	public static int binarySearch(int[] arr, int data, int low, int high) {

		if (low < high) {

			int mid = low + (high - low) / 2;

			if (data == arr[mid])
				return mid;

			else if (data < arr[mid])
				return binarySearch(arr, data, low, mid - 1);

			else 
				return binarySearch(arr, data, mid + 1, high);
		}

		return -1;
	}
	
	// update() to update an element from an array
	public static void update(int[] arr, int index, int ele) {
		
		arr[index] = ele;
	}

	public static void main(String[] args) {

		try {
			System.out.print("How many elements do you want to store? ");
			int MAX = BasicIO.nextInt();

			// creating an array
			int[] arr = ArrayIO.readArray(MAX);

			System.out.println("Original Arary: ");
			ArrayIO.printArray(arr);

			System.out.print("Enter the element to be update: ");
			int data = BasicIO.nextInt();

			int index = binarySearch(arr, data, 0, MAX - 1);
			
			System.out.print("With which element do you want to update? ");
			int ele = BasicIO.nextInt();
			
			// update() to update an element from an array
			update(arr, index, ele);
			
			System.out.println("Array after updation: ");
			ArrayIO.printArray(arr);
			
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







package arrays.one_dimensional_array;

import java.io.PrintWriter;
import java.io.StringWriter;

import fastIO.ArrayIO;
import fastIO.BasicIO;

// Java program to delete an element from an array
public class Deletion {
	
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
	
	// delete() to delete an element from an array
	public static void delete(int[] arr, int index) {
		
		for (int i = index; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];
		}
		
		System.out.println("Array after deletion: ");
		for (int i = 0; i < arr.length - 1; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	// driver method
	public static void main(String[] args) {
		
		try {
			System.out.print("How many elements do you want to store? ");
			int MAX = BasicIO.nextInt();
			
			// creating an array
			int[] arr = ArrayIO.readArray(MAX);
			
			// Original Array
			System.out.println("Original Array : ");
			ArrayIO.printArray(arr);
			
			System.out.print("Enter the element to be delete: ");
			int data = BasicIO.nextInt();
			
			int index = binarySearch(arr, data, 0, MAX - 1);
			
			// delete()
			delete(arr, index);
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




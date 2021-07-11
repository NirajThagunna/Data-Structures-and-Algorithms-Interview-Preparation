package arrays.one_dimensional_array;

import java.io.PrintWriter;
import java.io.StringWriter;

import fastIO.BasicIO;

// Java program to insert an element at it's correct position in a sorted array
public class InsertOperationInSortedArray {
	
	// insert() to insert an element in it's correct position
	public static int insert(int[] arr, int key, int n, int capacity) {
		
		if (n >= capacity)
			return n;
		
		int i = n - 1;
		
		while (i >= 0 && arr[i] > key) {
			arr[i + 1] = arr[i];
			i--;
		}
		
		arr[i + 1] = key;
		
		return (n + 1);
	}

	public static void main(String[] args) {

		try {
			System.out.print("How many elements do you want to store? ");
			int MAX = BasicIO.nextInt();
			
			// creating an array
			int[] arr = new int[MAX + 1];
			
			// taking the input from the user
			for (int i = 0; i < MAX; i++) {
				System.out.print("Enter any element: ");
				arr[i] = BasicIO.nextInt();
			}
			
			System.out.println("Original Array: ");
			for (int i = 0; i < MAX; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			
			System.out.print("Enter the element to be insert: ");
			int key = BasicIO.nextInt();
			
			int n = insert(arr, key, MAX, arr.length);
			
			System.out.println("Array after insertion: ");
			for (int i = 0; i < n; i++) {
				System.out.print(arr[i] + " ");
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


// Time Complexity: O(n)



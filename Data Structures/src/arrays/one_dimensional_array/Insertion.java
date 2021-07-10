package arrays.one_dimensional_array;

import java.io.PrintWriter;
import java.io.StringWriter;

import fastIO.BasicIO;

// Java program to insert an element at by particular position
public class Insertion {

	// insert() to insert an element
	public static void insert(int[] arr, int data, int pos) {
		
		for (int i = arr.length - 1; i > pos - 1; i--) {
			arr[i] = arr[i - 1];
		}
		
		// finally place the data element to it's correct position
		arr[pos - 1] = data;
	}
	
	// main() driver method
	public static void main(String[] args) {

		try {
			System.out.print("How many elements do you want to store? ");
			int MAX = BasicIO.nextInt();
			
			// Creating an array
			int[] arr = new int[MAX + 1];
			
			// initializing the values to an array
			for (int i = 0; i < MAX; i++) {
				System.out.print("Enter any element : ");
				int ele = BasicIO.nextInt();
				arr[i] = ele;
			}
			
			// Updating an element at a particular position
			System.out.print("Enter the element to be insert: ");
			int data = BasicIO.nextInt();
			
			System.out.print("Enter the position of an element to be insert: ");
			int pos = BasicIO.nextInt();
			
			// inserting an element
			insert(arr, data, pos);
			
			// array after insertion
			System.out.println("Array after insertion : ");
			for (int i = 0; i <= MAX; i++) {
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





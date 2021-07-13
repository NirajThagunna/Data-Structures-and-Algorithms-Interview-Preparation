package arrays.one_dimensional_array.problems;

import java.io.PrintWriter;
import java.io.StringWriter;

import fastIO.ArrayIO;
import fastIO.BasicIO;

// Java program to copy all the elements of an array into another array
public class CopyElements {
	
	// copy() method to copy all the elements of arr1 into arr2
	public static void copy(int[] arr1, int[] arr2) {
		
		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}
	}

	public static void main(String[] args) {

		try {
			System.out.print("Enter the size of an array: ");
			int n = BasicIO.nextInt();
			
			// Creating an array
			int[] arr1 = ArrayIO.readArray(n);
			
			// creating new array having sam elemnts as the arr1
			int[] arr2 = arr1.clone(); // deep copy is performed i.e. all the elements of arr1 are copied to arr2
			
			// original array
			System.out.println("\nElements of arr1: ");
			ArrayIO.printArray(arr1);
			
			// calling the copy() method
//			copy(arr1, arr2);
			System.out.println("\nElements of arr2: ");
			ArrayIO.printArray(arr2);
			
//			System.out.println(arr1 == arr2);
			
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
// Auxiliary Space: O(1)



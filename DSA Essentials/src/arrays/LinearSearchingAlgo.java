package arrays;

import java.util.Scanner;

// Linear Searching Algorithm
// The simplest searching algorithm that can works by repeatedly comparing the data element with all the elements of an array
// It can works in both Sorted as well as Unsorted array
public class LinearSearchingAlgo {

	// linearSearch() 
	public static int linearSearch(int[] arr, int key) {
		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i] == key) 
				return i;
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// Creating an array
		int[] arr = {40, 5, 20, 40, 10, 100, 25};
		
		System.out.print("Enter the element to be search: ");
		int key = scan.nextInt();
		
		// linearSearch()
		int index = linearSearch(arr, key);
		
		if (index == -1)
			System.out.println(key + " is NOT present!");
		else 
			System.out.println(key + " is present at index " + index);
		
		scan.close();
	}
}





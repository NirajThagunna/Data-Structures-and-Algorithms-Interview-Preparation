package arrays;

import java.util.Scanner;

// Binary Searching Algorithm - Iterative Method
public class BinarySearchingAlgo {
	
	// binarySearch()
	public static int binarySearch(int[] arr, int key) {
		
		int low = 0, high = arr.length - 1;
		
		while (low <= high) {
			
			int mid = low + (high - low) / 2;
			
			if (key == arr[mid])
				return mid;
			
			else if (key < arr[mid])
				high = mid - 1;
			
			else 
				low = mid + 1;
		}
		
		return -1;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		// Creating an array
		int[] arr = {1, 2, 3, 4, 5};

		System.out.print("Enter the element to be search: ");
		int key = scan.nextInt();

		// linearSearch()
		int index = binarySearch(arr, key);

		if (index == -1)
			System.out.println(key + " is NOT present!");
		else 
			System.out.println(key + " is present at index " + index);

		scan.close();
	}
}

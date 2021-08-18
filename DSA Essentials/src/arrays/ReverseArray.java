package arrays;

import java.util.Scanner;

// Java program to reverse an array
public class ReverseArray {
	
	// reverseArray() 
	public static void reverseArray(int[] arr) {
		
		int low = 0, high = arr.length - 1;
		
		while (low < high) {
			int temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			
			low++;
			high--;
		}
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("How many elements do you want to store? ");
		int MAX = scan.nextInt();
		
		// Creating an array
		int[] arr = new int[MAX];
		
		for (int i = 0; i < MAX; i++) {
			arr[i] = scan.nextInt();
		}
		
		System.out.println("Original Array: ");
		for (int ele: arr) {
			System.out.print(ele + " ");
		}
		System.out.println();
		
		reverseArray(arr);
		
		System.out.println("Array elements after reversing: ");
		for (int ele: arr) {
			System.out.print(ele + " ");
		}
	}
}





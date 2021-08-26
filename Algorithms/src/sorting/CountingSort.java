package sorting;

// Counting Sort Algorithm Implementation
public class CountingSort {

	// countingSort() 
	public static void countingSort(int[] arr, int n) {
		
		int largestEle = Integer.MIN_VALUE;
		
		for (int ele: arr) {
			largestEle = Math.max(largestEle, ele);
		}
		
		// to store the frequency of a number in a given array
		int[] count = new int[largestEle + 1];
		
		for (int i = 0; i < n; i++) {
			count[arr[i]]++;
		}
		
		// finding the correct position of an element in an array
		for (int i = 1; i < count.length; i++) {
			count[i] = count[i] + count[i - 1];
		}
		
		// Creating a temp[] array to store the final resultant array
		int[] temp = new int[n];
		
		for (int i = n - 1; i >= 0; i--) {
			temp[--count[arr[i]]] = arr[i];
		}
		
		// copying all the elements of temp array into arr
		for (int i = 0; i < n; i++) {
			arr[i] = temp[i];
		}
	}
	
	public static void main(String[] args) {
		
		int[] arr = {2, 1, 1, 0, 2, 5, 4, 0, 2, 8, 7, 7, 9, 2, 0, 1, 9}; 
		
		System.out.println("Array elements before sorting: ");
		for (int ele: arr) {
			System.out.print(ele + " ");
		}
		
		System.out.println("\nArray elements after sorting: ");
		countingSort(arr, arr.length);
		for (int ele: arr) {
			System.out.print(ele + " ");
		}
	}
}





package sorting;

import java.util.Arrays;

// Radix Sort Algorithm Implementation
public class RadixSort {

	// radixSort() 
	public static void radixSort(int[] arr, int n) {
		
		int max = Integer.MIN_VALUE;
		
		for (int ele: arr) {
			max = Math.max(max, ele);
		}
		
		for (int pos = 1; max / pos > 0; pos *= 10) {
			countingSort(arr, n, pos);
		}
	}
	
	public static void countingSort(int[] arr, int n, int pos) {
		
		int[] count = new int[10];
		
		for (int i = 0; i < n; i++) {
			
			count[(arr[i] / pos) % 10]++;
		}
		
		for (int i = 1; i < count.length; i++) {
			
			count[i] = count[i] + count[i - 1];
		}
		
		int[] temp = new int[n];
		
		for (int i = n - 1; i >= 0; i--) {
			
			temp[--count[(arr[i] / pos) % 10]] = arr[i];
		}
		
		for (int i = 0; i < n; i++) {
			arr[i] = temp[i];
		}
	}
	
	public static void main(String[] args) {
		
		int[] arr = {432, 8, 530, 90, 88, 231, 11, 45, 677, 199};
		
		System.out.println("Original Array: ");
		System.out.println(Arrays.toString(arr));
		
		radixSort(arr, arr.length);
		
		System.out.println("\nArray after performing the radix sort: ");
		System.out.println(Arrays.toString(arr));
	}
}





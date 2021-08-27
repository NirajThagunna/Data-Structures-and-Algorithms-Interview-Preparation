package sorting;

import java.util.Arrays;

// Java program to sort with comparator using built-in function
public class SortingWithComparatorInbuiltFun {
	
	public static void main(String[] args) {
		
		int[] arr = {5, 4, 1, 2, 3};

		Arrays.parallelSort(arr);
		
		System.out.println(Arrays.toString(arr));
	}
}

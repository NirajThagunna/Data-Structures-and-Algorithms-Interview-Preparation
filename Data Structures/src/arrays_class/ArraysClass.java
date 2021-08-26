package arrays_class;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

// Java program to demonstrate all the static methods available in Java Arrays Class
public class ArraysClass {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5, 10};
		
		// 1. asList(array)
		
		// to convert the elements of an array into List
		// returns as the elements of a List
		System.out.println("Integer array as List: " + Arrays.asList(arr));
		
		// 2. binarySearch(elementToBeSearched)
		// It uses binary search algorithm
		System.out.println("5 is present at position: " + Arrays.binarySearch(arr, 5));
		
		// 3. binarySearch(arr, from, to, key)
		System.out.println("4 is preseent at position: " + Arrays.binarySearch(arr, 2, 5, 2));
		
		// binarySearch() for character array
		char[] arr1 = {'A', 'B', 'C', 'D', 'E'};
		System.out.println("C is present at position: " + Arrays.binarySearch(arr1, 'C'));
		
		// 4. copyOf(array, newLength)
		int[] arr2 = Arrays.copyOf(arr, 8);
		System.out.println("Elements of arr2: " + Arrays.toString(arr2) + " Length: " + arr2.length);
		
		// 5. copyOfRange(array, fromIndex, toIndex)
		int[] arr3 = Arrays.copyOfRange(arr, 1, 4);
		System.out.println("Elements of arr3: " + Arrays.toString(arr3) + " Length: " + arr3.length);
		
		// 6. deepEquals(Obj[] arr1, Obj[] arr2)
		int[][] arr4 = {{1, 2, 3, 4, 5}};
		int[][] arr5 = {{1, 2, 3, 4, 5}};
		System.out.println("deepEquals() : " + Arrays.deepEquals(arr4, arr5));
		
		// 7. deepHashCode(Obj[] arr)
		System.out.println("deepHashCode() : " +Arrays.deepHashCode(arr4));
		
		// 8. deepToString(Obj[] arr)
		System.out.println("deepToString() : " + Arrays.deepToString(arr5));
		
		// 9. equals(arr1, arr2)
		int[] arr6 = {1, 2, 3, 4, 5};
		System.out.println("equals() : " + Arrays.equals(arr, arr6));
		
		// 10. fill(array, keyValue)
		// It will fill the each elements of an array with the keyValue
		Arrays.fill(arr6, 40);
		System.out.println("filling the values : " + Arrays.toString(arr6));
		
		// 11. hashCode(arr)
		// It will return the hashCode based on the contents of specified array
		System.out.println("hashCode() : " + Arrays.hashCode(arr));
		
		// 12. sort(arr)
		// It will sort an array in ascending order
		int[] arr7 = {15, 2, 20, 8, 1, 0};
		Arrays.sort(arr7);
		System.out.println("Sorting the data elements in ascending order : " + Arrays.toString(arr7));
		
		// 13. sort(arr, fromIndex, endIndex)
		int[] arr8 = {15, 2, 20, 8, 1, 0};
		Arrays.sort(arr8, 1, 5);
		System.out.println("Range Sort: " + Arrays.toString(arr8));
		
		// clone() - deepCopy
		int[] nums = {1, 2, 3, 4, 5};
		int[] nums1 = nums.clone();
		System.out.println(Arrays.toString(nums1));
		System.out.println(nums == nums1);
		
		// clone() - shallow copy
		int[][] nums2 = {{1, 2, 3}, {1, 2}};
		int[][] nums3 = nums2.clone();
		System.out.println(Arrays.toString(nums3));
		System.out.println(nums2 == nums3);
		System.out.println(nums2[0] == nums3[0]);
		
		int[] a = {1, 2, 5};
		int[] b = {1, 2, 5};
		
		System.out.println(Arrays.compare(a, b));
	
		System.out.println(Arrays.mismatch(a, b));
		
		int[] nums10 = {1, 10, 2, 5, 4, 100, 50};
		Arrays.parallelSort(nums10);
		System.out.println(Arrays.toString(nums10));
		
		Integer[] nums12 = {5, 8, 2, 5, 1, 10, 7};
		
		System.out.println(Arrays.toString(nums12));
		
		// Creating a comparator
		Comparator<Integer> comp = Collections.reverseOrder();
		
		Arrays.parallelSort(nums12, comp);
		
		System.out.println(Arrays.toString(nums12));
		
	}
}







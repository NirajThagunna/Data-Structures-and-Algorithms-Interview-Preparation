package sorting;

// Java program to sort an array in increasing order if the boolean value is true, decreasing order if false
public class SortingWithComparator {

	public static int[] sortingWithComparator(int[] arr, int n, boolean flag) {
		
		int[] temp = new int[n];
		
		int largestEle = Integer.MIN_VALUE;
		for (int ele: arr) {
			largestEle = Math.max(largestEle, ele);
		}
		
		int[] count = new int[largestEle + 1];
		
		for (int i = 0; i < n; i++) {
			count[arr[i]]++;
		}
		
		if (flag == true) {
			for (int i = 1; i < count.length; i++) {
				count[i] = count[i] + count[i - 1];
			}
		}
		else {
			for (int i = count.length - 2; i >= 0; i--) {
				count[i] = count[i] + count[i + 1];
			}
		}
		
		for (int i = n - 1; i >= 0; i--) {
			temp[--count[arr[i]]] = arr[i];
		}
		
		return temp;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {2, 1, 1, 0, 2, 5, 4, 0, 2, 8, 7, 7, 9, 2, 0, 1, 9};
				
		System.out.println("Array elements before sorting: ");
		for (int ele: arr) {
			System.out.print(ele + " ");
		}
		System.out.println();
		
		System.out.println("\nArray elements after sorting: ");
		int[] res = sortingWithComparator(arr, arr.length, false);
		for (int ele: res) {
			System.out.print(ele + " ");
		}
	}
}






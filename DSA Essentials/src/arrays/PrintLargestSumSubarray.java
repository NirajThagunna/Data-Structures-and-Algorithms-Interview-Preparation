package arrays;

// Java program to print the largest sum sub-array using kadane's algorithm
public class PrintLargestSumSubarray {

	// printLargestSumSubarray()
	public static void printLargestSumSubarray(int[] arr) {
		
		int max_end_here = 0, max_so_far = Integer.MIN_VALUE, start = 0, end = 0, s = 0;
		
		for (int i = 0; i < arr.length; i++) {
			
			max_end_here += arr[i];
			
			if (max_end_here < arr[i]) {
				max_end_here = arr[i];
			}
			
			if (max_so_far < max_end_here) {
				max_so_far = max_end_here;
				start = s;
				end = i;
			}
			
			if (max_end_here < 0) {
				s = i + 1;
			}
		}
		
		System.out.println("Maximum sub-array sum is: " + max_so_far);
		
		System.out.println("\nStart: " + start + "\nEnding index: " + end);
		
		System.out.println("\nLargest contiguous sub-array is: ");
		for (int i = start; i <= end; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		
//		int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
//		int[] arr = {-2, 3, 4, -1, 5, -12, 6, 1, 3};
//		int[] arr = {-1, -2, -3, -4};
		int[] arr = {-4, -8, -10, -2};
		
		printLargestSumSubarray(arr);
	}
}







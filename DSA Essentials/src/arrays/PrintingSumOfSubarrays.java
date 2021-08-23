package arrays;

// Java program to print the sum of all the sub-arrays
public class PrintingSumOfSubarrays {

	// printSumOfSubarrays() to print the sum of each sub-arrays and return the largest sum of each sub-arrays
	public static int printSumOfSubarrays(int[] arr) {
		
		// variable to hold the largest sum of sub-arrays
		int largestSum = Integer.MIN_VALUE;
		
		System.out.println("The sum of each sub-arrays are: ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				
				int sum = 0;
				for (int k = i; k <= j; k++) {
					sum += arr[k];
				}
				System.out.println(sum);
				
				// checking for the largest sum
//				if (sum > largestSum) {
//					largestSum = sum;
//				}
				
				largestSum = Math.max(largestSum, sum);
				
			}
			System.out.println();
		}
		
		return largestSum;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {-2, 3, 4, -1, 5, -12, 6, 1, 3};
//		int[] arr = {1, 2, 4, -2, 3};
		
		// printing all the elements of an array
		System.out.print("Elements of an array are: \n");
		for (int ele: arr) {
			System.out.print(ele + " ");
		}
		System.out.println("\n");
		
		int largestSum = printSumOfSubarrays(arr);
		System.out.println("The largest sum of sub-arrays is: " + largestSum);
	}
}

// Time Complexity: O(N^3)




package arrays;

// Java program to find the maximum sub-arrays sum using prefix sum
public class MaximumSubarraySum {

	// maximumSubArraySum() to find the maximum sub-arrays sum
	public static int maximumSubarraysSum(int[] arr) {
		
		int n = arr.length;
		int largestSum = Integer.MIN_VALUE;
		
		// Creating a temporary array to store the elements of prefixSum
		int[] prefixSum = new int[n];
		
		prefixSum[0] = arr[0];
		
		for (int i = 1; i < n; i++) {
			prefixSum[i] = prefixSum[i - 1] + arr[i];
		}
		
		// to find all the sub-arrays and find the sum of all the elements of sub-arrays
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				
				int sum = (i > 0) ? prefixSum[j] - prefixSum[i - 1] : prefixSum[j];
				
				// find out the maximum out of the sum and largest sum
				largestSum = Math.max(largestSum, sum);
			}
		}
		
		return largestSum;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {1, 2, 4, -2, 3};
		
		int largestSum = maximumSubarraysSum(arr);
		
		System.out.println("Largest sum of sub-arrays is: " + largestSum);
	}
}


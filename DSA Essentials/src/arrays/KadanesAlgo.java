package arrays;

// Java program to find the maximum sub-arrays sum using kadane's algorithm 
public class KadanesAlgo {

	// maximumSubarraysSum() 
	public static int maximumSubarraysSum(int[] arr) {
		
		int currentSum = 0;
		int largestSum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			
			currentSum += arr[i];
			
			if (currentSum < 0)
				currentSum = 0;
			
			largestSum = Math.max(largestSum, currentSum);
		}
		
		return largestSum;
	} 
	
	public static void main(String[] args) {
		
		int[] arr = {-2, 3, 4, -1, 5, -12, 6, 1, 3};
		
		int largestSum = maximumSubarraysSum(arr);
		
		System.out.println("Maximum sub-arrays sum is: " + largestSum);
	}
}

// Time Complexity: O(n)




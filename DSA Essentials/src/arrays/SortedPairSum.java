package arrays;

// Java program to print the sorted pair sum
public class SortedPairSum {
	
	// sortedPairSum() to find the pair which sum is closest to the given sum x
	public static void sortedPairSum(int[] arr, int n, int x) {
		
		// to store the result pair indexes
		int left_ind = 0, right_ind = 0;
		
		// to iterate through an array and find the diff between the sum of pairs and the given sum x
		int low = 0, high = n - 1, diff = Integer.MAX_VALUE;
		
		while (low < high) {
			
			// to check the first closest pair 
			if (Math.abs(arr[low] + arr[high] - x) < diff) {
				
				left_ind = low;
				right_ind = high;
				diff = Math.abs(arr[low] + arr[high] - x);
			}
			
			// if the pair sum is greater than the given sum
			if ((arr[low] + arr[high]) > x) {
				high--;
			}
			else {
				low++;
			}
		}
		
		System.out.println("The sorted pair sum is: " + arr[left_ind] + " and " + arr[right_ind]);
	}
	
	public static void main(String[] args) {
		
		int[] arr = {10, 22, 28, 29, 30, 40};
		
		sortedPairSum(arr, arr.length, 54);
	}
}








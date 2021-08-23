package arrays;

// Prefix Sum 
// Prefix sum of a given array of size n is an another array of same size such that prefixSum[i] = arr[0] + arr[1] + ... + arr[i]
// Java program to find the prefix sum of an array
public class PrefixSum {

	// prefixSum()
	public static int[] prefixSum(int[] arr) {
		
		// Creating a new array that is prefixSum
		int[] prefixSum = new int[arr.length];
		
		prefixSum[0] = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			prefixSum[i] = prefixSum[i - 1] + arr[i];
		}
		
		return prefixSum;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {10, 20, 30, 40, 50};
		
		// Printing the original array
		System.out.println("Original array: ");
		for (int ele: arr) {
			System.out.print(ele + " ");
		}
		System.out.println("\n");
		
		// prefixSum()
		int[] prefixSum = prefixSum(arr);
		
		System.out.println("Elements of prefixSum array: ");
		for (int ele: prefixSum) {
			System.out.print(ele + " ");
		}
	}
}

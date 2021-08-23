package arrays;

// Kadane's algorithm for negative numbers
public class KadanesAlgoForNegNums {

	// kadanesAlgoNegNums()
	public static int kadanesAlgoForNegNums(int[] arr) {
		
		int max_end_here = 0, max_so_far = Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			
			max_end_here += arr[i];
			
			if (max_end_here < arr[i]) {
				max_end_here = arr[i];
			}
			
			max_so_far = Math.max(max_so_far, max_end_here);
			
//			if (max_end_here > max_so_far) {
//				max_so_far = max_end_here;
//			}
		}
		
		return max_so_far;
	}
	
	public static void main(String[] args) {
		
//		int[] arr = {-1, -2, -3, -4};
		int[] arr = {-2, 3, 4, -1, 5, -12, 6, 1, 3};
		
		int largestSum = kadanesAlgoForNegNums(arr);
		System.out.println("Maximum sum of sub-arrays is: " + largestSum);
	}
}







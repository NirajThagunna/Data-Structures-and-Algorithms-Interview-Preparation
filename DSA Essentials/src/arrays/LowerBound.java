package arrays;

// Java program to find the lower bound of a given input number in a given array of integer of sorted array
public class LowerBound {

	// lowerBound()
	public static int lowerBound(int[] arr, int val) {
		
		int index = 0;
		
		for (int i = 0; i < arr.length; i++) {
			
			if (val >= arr[i])
				index = i;
		}
		
		return arr[index];
	}
	
	public static void main(String[] args) {
		
//		int[] arr = {-1, -1, 2, 3, 5};
		int[] arr = {1, 2, 3, 4, 6};
		
		int lowerBound = lowerBound(arr, 4);
		System.out.println("Lower bound of 4 is: " + lowerBound);
	}
}

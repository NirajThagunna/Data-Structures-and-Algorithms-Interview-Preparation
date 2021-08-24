package arrays;

// Java program to print the largest element from a given integer array
public class LargestElement {

	// largestElement()
	public static int largestElement(int[] arr) {
		
		int largestElement = Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			
			if (largestElement < arr[i]) {
				largestElement = arr[i];
			}
		}
		
		return largestElement;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {-3, 4, 1, 2, 3};
		
		System.out.println("Given array elements are: ");
		for (int ele: arr) {
			System.out.print(ele + " ");
		}
		
		System.out.println("\nLargest element is: " + largestElement(arr));
	}
}



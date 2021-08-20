package arrays;

// Java program to print all the pairs in an array
public class PrintingPairs {

	// pairs() to print all the pairs of elements of an array
	public static void pairs(int[] arr) {
		
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				System.out.print("(" + arr[i] + ", " + arr[j] + ")," + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5};
		
		pairs(arr);
	}
}

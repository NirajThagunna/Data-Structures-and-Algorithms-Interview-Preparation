package arrays;

// Java program to rotate an array k times in clockwise
public class RotateArrayKtimesClockwise {

	// rotateArrayKtimes() 
	public static void rotateArrayKtimes(int[] arr, int n, int k) {
		
		// if the rotation is greater than the array size then find the modulus w.r.t n
		// because after each n rotation the resultant array will be same as the initial array
		k = k % n;
		
		for (int i = 0; i < n; i++) {
			
			if (i < k) {
				
				// print the rightmost kth elements
				System.out.print(arr[n + i - k] + " ");
			}
			else {
				// print the elements before kth elements after kth elements
				System.out.print(arr[i - k] + " ");
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
//		int[] arr = {1, 3, 5, 7, 9};
		int[] arr = {1, 2, 3, 4, 5};
		
		rotateArrayKtimes(arr, arr.length, 2);
	}
}




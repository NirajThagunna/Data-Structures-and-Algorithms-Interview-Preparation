package fastIO;

// ArrayIO - Read an Array I/O
public class ArrayIO {

	// Reading an array of int having size n
	public static int[] readArray(int n) {
		
		int[] temp = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Enter any element : ");
			int ele = BasicIO.nextInt();
			temp[i] = ele;
		}
		
		return temp;
	}
	
	// Printing an array
	public static void printArray(int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}


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
	
	// reading the 2-D array elements
	public static void readArray(int[][] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print("Enter any element: ");
				arr[i][j] = BasicIO.nextInt();
			}
		}
	}
	
	// printing the 2-D array
	public static void printArray(int[][] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
}





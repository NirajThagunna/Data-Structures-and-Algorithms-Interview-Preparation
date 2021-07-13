package arrays.one_dimensional_array;

// An array having different number of column data elements
// If we are creating odd number of columns in a 2D array, it is known as a jagged array. 
// In other words, it is an array of arrays with different number of columns.
public class JaggedArray {

	public static void main(String[] args) {
		
		// Creating an array
		// no of rows is a mandatory part of an array
		int[][] arr = new int[3][];
		
		// assigning the number of columns
		arr[0] = new int[2];
		arr[1] = new int[4];
		arr[2] = new int[3];
		
		// Storing the data into an array
		int count = 1;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = count++;
			}
		}
		
		// Printing the data elements of an array
		for (int[] ele: arr) {
			for (int item: ele) {
				System.out.print(item + " ");
			}
			System.out.println();
		}
		
		// printing a class name for an object
		System.out.println(arr.getClass().getName());
	}
}




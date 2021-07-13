package arrays.one_dimensional_array;

// Anonymous array in Java
public class AnonymousArray {

	public static int sumOfArray(int[] arr) {
		
		int sum = 0;
		
		for (int ele: arr) {
			sum += ele;
		}
		
		return sum;
	}
	public static void main(String[] args) {
		System.out.println("Sum: " + sumOfArray(new int[] {1, 2, 3, 4, 5})); // Passing an anonymous array in the method
	}
}

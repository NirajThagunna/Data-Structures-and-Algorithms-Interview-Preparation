package sorting;

// Java program for chopsticks
public class Chopsticks {

	// pairSticks() to find the pairs whose difference is equal to the given length of a stick
	public static int pairSticks(int[] arr, int n, int D) {
		
		int count = 0;
		
		for (int i = 0; i < n - 1; i++) {
			
			if (arr[i + 1] - arr[i] <= D) {
				count++;
				i++;
			}
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {1, 3, 3, 9, 4};
		
		int result = pairSticks(arr, arr.length, 2);
		
		System.out.println(result);
	}
}





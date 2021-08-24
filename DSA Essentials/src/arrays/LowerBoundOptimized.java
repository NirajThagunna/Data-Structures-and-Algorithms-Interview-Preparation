package arrays;

// Java program to find the lower bound of a given number by dividing the given array into two halves
// array is sorted
public class LowerBoundOptimized {

	public static int lowerBound(int[] arr, int val) {

		int low = 0, high = arr.length - 1;

		int lowerBound = -1;

		while (low <= high) {

			int mid = (low + high) / 2;

			if (arr[mid] > val) {
				high = mid - 1;
			}
			else {
				lowerBound = arr[mid];
				low = mid + 1;
			}
		}

		return lowerBound;
	}

	public static void main(String[] args) {

				int[] arr = {-1, -1, 2, 3, 5};
//		int[] arr = {1, 2, 3, 4, 6};

		int lowerBound = lowerBound(arr, 4);
		System.out.println("Lower bound of 4 is: " + lowerBound);
	}
}



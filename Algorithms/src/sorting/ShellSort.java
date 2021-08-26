package sorting;

// Java - Shell Sorting Algorithm Implementation
public class ShellSort {

	// shellSort()
	public static void shellSort(int[] arr, int n) {
		
		for (int gap = n / 2; gap >= 1; gap /= 2) {
			
			for (int j = gap; j < n; j++) {
				
				for (int i = j - gap; i >= 0; i -= gap) {
					
					if (arr[i + gap] >= arr[i]) {
						break;
					}
					else {
						int temp = arr[i];
						arr[i] = arr[i + gap];
						arr[i + gap] = temp;
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		int[] arr = {23, 29, 15, 19, 31, 7, 9, 5, 2};
		
		System.out.println("Array elements before sorting: ");
		for (int ele: arr) {
			System.out.print(ele + " ");
		}
		
		System.out.println("\nArray elements after sorting: ");
		shellSort(arr, arr.length);
		for (int ele: arr) {
			System.out.print(ele + " ");
		}
	}
}




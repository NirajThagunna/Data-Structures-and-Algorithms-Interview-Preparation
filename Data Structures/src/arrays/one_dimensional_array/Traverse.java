package arrays.one_dimensional_array;

import java.io.PrintWriter;
import java.io.StringWriter;

// Java program to traverse an array i.e. printing all the elements of an array one by one
public class Traverse {
	
	public static void main(String[] args) {
		
		try {
			
			// declaring an array
			int[] arr;
			
			// instantiation - allocate the memory
			arr = new int[5];
			
			// initializing the values
			arr[0] = 1;
			arr[1] = 2;
			arr[2] = 5;
			arr[3] = 7;
			arr[4] = 10;
			
			// accessing the elements of an array
			for (int i = 0; i < arr.length; i++) {
				System.out.println("arr[" + i + "] = " + arr[i]);
			}
		}
		catch (Exception ex) {
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			ex.printStackTrace(pw);
			String error = sw.toString();
			System.out.println("Error : \n" + error);
		}
	}
}


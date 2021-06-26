package recursion;

import java.io.PrintWriter;
import java.io.StringWriter;

import fastIO.BasicIO;

// Java program to find the nth fibonacci series number
public class FibonacciSeries {

	// method to find the nth fibonacci number
	public static int fibonacciNumber(int n) {

		// base case
		if (n <= 1)
			return n;

		return fibonacciNumber(n - 1) + fibonacciNumber(n - 2);
	}

	// main() method
	public static void main(String[] args) {
		try {
			System.out.print("Enter the nth number whose fibonacci number do you want to found : ");
			int n = BasicIO.nextInt();

			// factorial of a number
			int result = fibonacciNumber(n);
			System.out.printf("The %d fibonacci number is %d", n, result);
		}
		catch (Exception ex) {
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			ex.printStackTrace(pw);
			String error = sw.toString();
			System.out.println("Error : " + error);
		}
	}
}



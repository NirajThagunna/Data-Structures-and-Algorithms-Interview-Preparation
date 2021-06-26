package recursion;

import java.io.PrintWriter;
import java.io.StringWriter;

import fastIO.BasicIO;

/*
 * @Author: Niraj Thagunna
 * 
 * Java Program to find the factorial of a number.
 */
public class FactorialOfaNumber {

	// method to find the factorial of a number
	public static int factorial(int n) {
		
		// base case
		if (n == 0)
			return 1;
		
		return n * factorial(n - 1);
	}
	
	// main() method
	public static void main(String[] args) {
		try {
			System.out.print("Enter any number : ");
			int num = BasicIO.nextInt();
			
			// factorial of a number
			int result = factorial(num);
			System.out.printf("Factorial of %d is %d.", num, result);
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


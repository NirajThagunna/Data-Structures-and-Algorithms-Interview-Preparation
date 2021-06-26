package recursion;

import java.io.PrintWriter;
import java.io.StringWriter;

import fastIO.BasicIO;

// Java program to find the Exponentiation - Calculate the pow(x, n) using Recursion
public class Exponentiation {

	// method to find the exponentiation || power of a number
	public static int pow(int x, int n) {

		// base case
		if (n == 0)
			return 1;

		else if (n % 2 == 0) {
			int temp = pow(x, n / 2);
			return temp * temp;
		}

		else 
			return x * pow(x, n - 1);
	}

	// main() method
	public static void main(String[] args) {
		try {
			System.out.print("Enter any number : ");
			int x = BasicIO.nextInt();
			System.out.print("Enter the power of a number : ");
			int n = BasicIO.nextInt();

			// factorial of a number
			int result = pow(x, n);
			System.out.printf("pow(%d, %d) is %d", x, n, result);
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



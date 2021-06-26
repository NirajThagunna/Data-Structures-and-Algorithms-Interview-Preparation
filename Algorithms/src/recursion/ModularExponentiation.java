package recursion;

import java.io.PrintWriter;
import java.io.StringWriter;

import fastIO.BasicIO;

// Java program to find the modular exponentiation - Using Recursion
public class ModularExponentiation {

	// method to find the modular exponentiation
	public static int modExp(int a, int b, int c) {

		// base case
		if (b == 0)
			return 1;

		else if (b % 2 == 0) {
			int temp = modExp(a, b / 2, c);
			return (temp * temp) % c;
		}

		else
			return ((a % c) * modExp(a, b - 1, c)) % c;
	}

	// main() method
	public static void main(String[] args) {
		try {
			System.out.print("Enter first number : ");
			int num1 = BasicIO.nextInt();
			System.out.print("Enter second number : ");
			int num2 = BasicIO.nextInt();
			System.out.print("Enter third number : ");
			int num3 = BasicIO.nextInt();

			// modular exponentiation
			int result = modExp(num1, num2, num3);
			System.out.printf("pow(%d, %d) mod %d is %d", num1, num2, num3, result);
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



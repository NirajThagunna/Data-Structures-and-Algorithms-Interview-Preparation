package basics;

/*
 * @Author: Niraj Thagunna
 * 
 * Enum in Java
 * Declaration of enum in Java
 * 
 * 1. enum outside the class
 */

// Declaration of enum outside of the class
enum Color {
	RED, GREEN, BLUE;
}

public class Enum {

	public static void main(String[] args) {
		
		// Accessing the Color data type class
		Color c1 = Color.RED;
		System.out.println(c1);
	}
}

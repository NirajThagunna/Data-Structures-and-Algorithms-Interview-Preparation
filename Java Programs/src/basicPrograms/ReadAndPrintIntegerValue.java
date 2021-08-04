package basicPrograms;

import java.util.Scanner;

// Java program to read and print Integer value.
public class ReadAndPrintIntegerValue {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		System.out.println("Integer value : " + num);
		
		sc.close();
	}
}

package basicPrograms;

// Java program to swap two numbers
public class SwapTwoNumbers {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		System.out.println("Before swapping: ");
		System.out.println(a);
		System.out.println(b);
		
		int temp = a;
		a = b;
		b = temp;
		
		System.out.println("After swapping: ");
		System.out.println(a);
		System.out.println(b);
	}
}

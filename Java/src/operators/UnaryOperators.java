package operators;

// Unary operators in Java
public class UnaryOperators {

	public static void main(String[] args) {
		
		// Unary minus operator (-)
		int a = 5;
		a = -a;
		System.out.println(a);
		
		int b = -10;
		b = -b;
		System.out.println(b);
		
		// Unary NOT operator (!)
		int c = 10;
		int d = 15;
		
		System.out.println(c < d);
		System.out.println(!(c < d));
		
		// Bitwise complement of a number
		int e = 5;
		System.out.println("Bitwise complement : " + ~e);
		int f = 7;
		System.out.println("Bitwise Complement : " + ~f);
	}
}





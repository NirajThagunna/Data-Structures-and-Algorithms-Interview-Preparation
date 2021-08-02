package methods;

// main() method is present in two inherited classes
public class Methods {

	public static void main(String[] args) {
		
		System.out.println("I am the first one!");
	}
}

class Methods1 extends Methods {
	
	public static void main(String[] args) {
		
		System.out.println("I am the second one!");
	}
}

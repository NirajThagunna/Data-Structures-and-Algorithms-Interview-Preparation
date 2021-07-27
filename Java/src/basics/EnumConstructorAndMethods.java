package basics;

// Java program to demonstrate the enum class can contains both the Constructors and concrete methods
enum Color1 {
	RED, GREEN, BLUE;
	
	// Constructor that can be called separately for each enum constants at the time of enum class loading
	private Color1() {
		System.out.println("Constructor called for : " + this.toString());
	}
	
	// Concrete method
	public static void colorInfo() {
		System.out.println("Universal Color!");
	}
}

public class EnumConstructorAndMethods {

	public static void main(String[] args) {
		
		Color1 c1 = Color1.RED;
		System.out.println(c1);
		Color1.colorInfo();
	}
}




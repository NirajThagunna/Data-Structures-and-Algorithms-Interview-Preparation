package methods;

// Overloading the main() method in Java
public class OverloadMain {

	public static void main(String[] args) {
		System.out.println("I am the first one!");
		main("Niraj Thagunna");
		main("A", "B");
	}
	
	public static void main(String args) {
		System.out.println(args);
	}
	
	public static void main(String args, String args1) {
		System.out.println(args + " " + args1);
	}
}

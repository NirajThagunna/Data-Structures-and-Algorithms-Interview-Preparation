package inputAndOutput;

// Java program to take the input from a console
public class ConsoleInput {

	public static void main(String[] args) {
		
		String name = System.console().readLine();
		
		System.out.println("Name : " + name);
	}
}

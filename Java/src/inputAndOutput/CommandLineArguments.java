package inputAndOutput;

// Command Line Arguments in Java
public class CommandLineArguments {

	public static void main(String[] args) {
		
		if (args.length > 0) {
			System.out.println("Command line arguments are: ");
			
			for (String val: args) {
				System.out.println(val);
			}
		}
		else {
			System.out.println("No any arguments are passed!");
		}
	}
}

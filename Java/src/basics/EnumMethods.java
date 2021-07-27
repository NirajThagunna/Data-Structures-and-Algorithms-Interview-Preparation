package basics;

// Enum Methods -> values(), ordinal(), valueOf()
enum Colors {
	RED, GREEN, BLUE;
}

public class EnumMethods {
	
	public static void main(String[] args) {
		
		// values() method returns all values present inside enum
		Colors[] arr = Colors.values();
		
		// Iterate through the arr
		// ordinal() method returns the index of each enum constant
		for (Colors color: arr) {
			System.out.println(color + " is present at index : " + color.ordinal());
		}
		
		// valueOf() method returns the enum constant of the specified value by matching, if exist
		System.out.println(Colors.valueOf("GREEN"));
	}
}

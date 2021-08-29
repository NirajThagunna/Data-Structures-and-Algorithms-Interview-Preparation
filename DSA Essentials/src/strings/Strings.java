package strings;

public class Strings {

	public static void main(String[] args) {
		
		// ways to create a string
		
		// 1. String Literals
		String str = "Niraj Thagunna";
		System.out.println(str);
		
		// 2. Using new keywords
		String str1 = new String("Niraj Thagunna");
		System.out.println(str1);
		
		String b = "Niraj";
		String c = "Niraj Thagunna";
		
		System.out.println(str == b);
		System.out.println(str == str1);
		System.out.println(str == c);
		
		// Strings in java internally backed by char array
		char[] arr = {'N', 'i', 'r', 'a', 'j'};
		System.out.println(arr);
	}
}

package wrapperClasses;

public class AutoboxingAndUnboxing {

	public static void main(String[] args) {
		
		// Autoboxing - Converting a primitive data type values into it's corresponding wrapper class
		// Autoboxing of character
		Character ch = 'n';
		
		System.out.println(ch);
		
		// Auto-Unboxing 
		char var = ch;
		System.out.println(var);
		
		// Unboxing 
		Integer i = 20;
		
		// Unboxing of Integer wrapper class object into it's corresponding primitive values
		int i1 = i;
		
		System.out.println(i1);
	}
}

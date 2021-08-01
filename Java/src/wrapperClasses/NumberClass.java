package wrapperClasses;

// java.lang.Number class contains all the wrapper classes for the primitive data types
public class NumberClass {

	public static void main(String[] args) {
		
		// Converting the wrapper class into the numeric integers
		Double d = 1_00_000.5_26_709d;
		
		System.out.println(d);
		
		// convert Integer d wrapper class object d into the primitive data types value
		int num = d.intValue();
		
		System.out.println(num);
		
		Integer i = 10;
		
		System.out.println(i.compareTo(10));
	}
}

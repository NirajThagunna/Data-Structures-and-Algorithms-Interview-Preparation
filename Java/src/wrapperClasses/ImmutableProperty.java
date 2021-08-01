package wrapperClasses;

// Primitive wrapper classes are immutable in Java
public class ImmutableProperty {
	
	public static void modify(Integer i) {
		
		i =+ 1;
	}

	public static void main(String[] args) {
		
//		Integer i = new Integer(50);
		
		// In the latest version of Java
		Integer i = 50;
		
		System.out.println(i);
		
		modify(i);
		
		System.out.println(i);
	}
}

package operators;

// Java program to demonstrate the application of instanceof operator
class Parent {
	
}

class Child extends Parent {
	
}

public class InstanceOfOperator {

	public static void main(String[] args) {
		
		Parent obj = new Parent();
		
		if (obj instanceof Child) {
			System.out.println("Okay");
		}
		else {
			System.out.println("Not Okay!");
		}
	}
}

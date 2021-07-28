package basics;

// A variable whose value cannot be changed once you have initialized the value is called a final variable.
// A variable which cannot be initialized at the time of declaration.
public class BlankFinalVariable {

	final int x;
	
	public BlankFinalVariable(int x) {
		this.x = x;
	}
	
	public BlankFinalVariable() {
		this(20);
	}
	
	public static void main(String[] args) {
		
		BlankFinalVariable obj1 = new BlankFinalVariable(10);
		System.out.println(obj1.x);
		
		BlankFinalVariable obj2 = new BlankFinalVariable();
		System.out.println(obj2.x);
	}
}

package methods;

// Variable Arguments varargs in Java
public class VariableArguments {
	
	// declaring a varargs in Java
	public static void fun(String str, int ...a) {
		
		System.out.println("String : " + str);
		System.out.println("Length : " + a.length);
		
		for (int val: a) {
			System.out.print(val + " ");
		}
	} 
	
	public static void main(String[] args) {
		
		fun("Niraj", 10);
		fun("Niraj", 1, 2, 3, 4, 5);
		fun("Niraj", 100);
	}
}

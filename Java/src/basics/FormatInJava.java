package basics;

// Java formatter
public class FormatInJava {

	public static void main(String[] args) {
		float a = 5.43f;
		float b = 2.653f;
		
		float res = a / b;
		
		System.out.print(res + " ");
		System.out.format("%.3f", res);
	}
}

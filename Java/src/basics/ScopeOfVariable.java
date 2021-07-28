package basics;

public class ScopeOfVariable {
	
	public static void main(String[] args) {
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		int i = 20;
		System.out.println(i);
	}
}

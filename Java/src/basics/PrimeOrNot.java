package basics;

public class PrimeOrNot {

	public static void isPrime(int n) {
		
		for (int i = 2; i <= Math.sqrt(n); i++) {
			
			if (n % i != 0) {
				System.out.println("No");
			}
		}
		
		System.out.println("Yes");
	}
	public static void main(String[] args) {
		
		int n = 1;
		isPrime(n);
	}
}

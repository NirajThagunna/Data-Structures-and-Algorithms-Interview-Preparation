package basicPrograms;

// Java program to the hcf of the two numbers
public class HCF1 {

	public static void main(String[] args) {
		
		int x = 625, y = 125, hcf = 1;
		
		for (int i = 1; i <= x && i <= y; i++) {
			
			if (x % i == 0 && y % i == 0) {
				hcf = i;
			}
		}
		
		System.out.println("HCF is: " + hcf);
	}
}

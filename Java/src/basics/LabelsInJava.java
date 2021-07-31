package basics;

/*
 * Java doesn't support goto statement 
 * Instead of goto statement Java uses label
 */
public class LabelsInJava {

	public static void main(String[] args) {
		
		// label for outer loop
		outer:
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 10; j++) {
					if (j == 1)
						continue outer;
					System.out.println("Value of j : " + j);
				}
			}
	}
}

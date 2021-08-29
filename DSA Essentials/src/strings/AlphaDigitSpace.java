package strings;

// Java program to count the number of alpha, digit and spaces in a string
public class AlphaDigitSpace {

	public static void main(String[] args) {
		
		String str = "1Niraj Thagunna Engineer 0";
		
		// length() 
		System.out.println(str.length());
		
		// At first convert the string into the char array
		char[] charArray = str.toCharArray();
		
		int digit = 0;
		int alpha = 0;
		int space = 0;
		
		int i = 0;
		while (i != charArray.length) {
			
			if (charArray[i] >= '0' && charArray[i] <= '9') {
				digit++;
			}
			else if (charArray[i] >= 'a' && charArray[i] <= 'z' || charArray[i] >= 'A' && charArray[i] <= 'Z') {
				alpha++;
			}
			else if (charArray[i] == ' ' || charArray[i] == '\t') {
				space++;
			}
			
			i++;
		}
		
		System.out.println("Total Digit: " + digit);
		System.out.println("Total Alpha: " + alpha);
		System.out.println("Total spaces: " + space);
	} 
}


package basicPrograms;

// Java program to add two binary strings
public class AddTwoBinaryStrings {

	// addBinaryStrings()
	public static String addBinaryStrings(String x, String y) {
		
		// to store the result
		String res = "";
		
		// to store the carry digit
		int d = 0;
		
		// to traverse the string from the left most digit
		int k = x.length() - 1, l = y.length() - 1;
		
		while ((k >= 0) || (l >= 0) || (d == 1)) {
			
			// add carry to all the binary digits of a number 
			d += ((k >= 0) ? x.charAt(k) - '0' : 0);
			d += ((l >= 0) ? y.charAt(l) - '0' : 0);
			
			// add carry digit to the res
			res = (char)(d % 2 + '0') + res;
			
			// to compute the carry digit
			d /= 2;
			
			// decrement the iteration variable to get the next digit
			k--;
			l--;
		}
		
		// return the res
		return res;
	}
	
	public static void main(String[] args) {
		
		String x = "011011";
		String y = "1010111";
		
		String result = addBinaryStrings(x, y);
		System.out.println(result);
	}
}






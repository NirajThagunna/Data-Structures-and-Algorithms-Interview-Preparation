package fastIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// Fast Reader class in Java for I/O
public class BasicIO {
	
	// It uses both the BufferedReader and StringTokenizer class
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static StringTokenizer st;
	
	// next() method to get all the tokens present in a String
	public static String next() {
		while (st == null || !st.hasMoreElements()) {
			try {
				st = new StringTokenizer(br.readLine());
			}
			catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		return st.nextToken();
	}
	
	// convert a String token into an int value
	public static int nextInt() {
		return Integer.parseInt(next());
	}
	
	// long
	public static long nextLong() {
		return Long.parseLong(next());
	}
	
	// double
	public static double nextDouble() {
		return Double.parseDouble(next());
	}
	
	// Taking a String
	public static String nextLine() {
		String str = "";
		try {
			str = br.readLine();
		}
		catch (IOException ex) {
			ex.printStackTrace();
		}
		return str;
	}
}






package inputAndOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// FastReader - It uses BufferedReader and StringTokenizer
class FastInputAndOutput {
	
	BufferedReader br;
	StringTokenizer st;
	
	public FastInputAndOutput() {
		br = new BufferedReader(new InputStreamReader(System.in));
	}
	
	public String next() {
		
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
	
	public int nextInt() {
		return Integer.parseInt(next());
	}
	
	public String nextLine() {
		
		String str = "";
		
		try {
			str = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return str;
	}
}

public class FastReader {
	
	public static void main(String[] args) {
		
		FastInputAndOutput obj = new FastInputAndOutput();
		
		System.out.print("Enter any number : " );
		int num = obj.nextInt();
		
		System.out.print("Enter any string : ");
		String str = obj.nextLine();
		
		System.out.println(num + " " + str);
	}
}






package basicPrograms;

// Java program to find the largest of three numbers
public class LargestOfThreeNumbers {

	public static void main(String[] args) {
	
		int x  = 5, y = 2, z = 7;
		
		if (x > y && x > z)
			System.out.println(x);
		
		else if (y > x && y > z)
			System.out.println(y);
		
		else 
			System.out.println(z);
	}
}

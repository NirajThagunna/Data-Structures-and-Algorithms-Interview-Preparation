package basics;

// Java program to demonstrate the nested switch statement
public class NestedSwitchStatement {

	public static void main(String[] args) {
		
		int year = 2;
		String branch = "CSE";
		
		switch (year) {
		
		case 1:
			System.out.println("Learn Basics!");
			break;
			
		case 2:
			
			switch (branch) {
			
			case "EE":
				System.out.println("God bless you beta!");
				break;
				
			case "CSE":
				System.out.println("You are genius myan!");
				break;
				
			default:
				System.out.println("So bad!");
				break;
			}
			break;
			
		default:
			System.out.println("No way!");
		}
	}
}

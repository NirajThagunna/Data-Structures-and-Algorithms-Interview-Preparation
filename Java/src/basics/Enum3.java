package basics;

// Passing the enum into the switch statements as an arguments
enum Day {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}

public class Enum3 {
	
	Day day;
	
	public Enum3(Day day) {
		this.day = day;
	}
	
	// print the week of the day
	public void isDayLike() {
		
		switch (day) {
			
		case MONDAY:
		case TUESDAY:
			System.out.println("A little bit good day!");
			break;
			
		case FRIDAY:
			System.out.println("Sunny Day!");
			break;
			
		case SATURDAY:
		case SUNDAY:
			System.out.println("CHILL DAY!");
			break;
			
		default:
			System.out.println("Not that much bad!");
			break;
		}
	}
	
	// main() || Driver class
	public static void main(String[] args) {
		
		String str = "SUNDAY";
		Enum3 obj = new Enum3(Day.valueOf(str));
		obj.isDayLike();
	}
}





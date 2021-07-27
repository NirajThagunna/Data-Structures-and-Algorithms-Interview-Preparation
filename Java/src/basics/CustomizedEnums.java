package basics;

// Java program for the customized enum values
// Java program to demonstrate how values can be assigned to enums
enum TrafficSignal {
	
	// This will call enum constructor with one String argument
	RED("STOP"), GREEN("GO"), ORANGE("SLOW DOWN");
	
	// declaring private variable for getting the values
	private String action;
	
	// getter method
	public String getAction() {
		return this.action;
	}
	
	// enum constructor
	private TrafficSignal(String action) {
		this.action = action;
	}
}

public class CustomizedEnums {

	public static void main(String[] args) {
		
		// Printing the enum and their values 
		TrafficSignal[] signals = TrafficSignal.values();
		
		// getting the enum name and it's value
		for (TrafficSignal signal: signals) {
			System.out.println("Name: " + signal.name() + " Action: " + signal.getAction());
		}
	}
}




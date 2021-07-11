package arrays.one_dimensional_array;

import java.io.PrintWriter;
import java.io.StringWriter;

// Java program for non-primitive data type - array of objects
class Student {
	
	private int rollNo;
	private String name;
	
	public Student(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}
	
	public void display() {
		System.out.println(this.rollNo + " " + this.name);
	}
}

public class ArrayOfObjects {

	public static void main(String[] args) {
		
		try {
			Student[] student = new Student[5];
			
			student[0] = new Student(80, "Niraj Thagunna");
			student[1] = new Student(80, "Niraj Thagunna");
			student[2] = new Student(80, "Niraj Thagunna");
			student[3] = new Student(80, "Niraj Thagunna");
			student[4] = new Student(70, "Niru");
			
			for (int i = 0; i < student.length; i++) {
				student[i].display();
			}
			
		}
		catch (Exception ex) {
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			ex.printStackTrace(pw);
			String error = sw.toString();
			System.out.println("Error : \n" + error);
		}
	}
}




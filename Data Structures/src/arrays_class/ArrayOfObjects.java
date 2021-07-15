package arrays_class;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.Comparator;

// Java program to sort an array of objects in ascending order
class Student {
	private int rollNo;
	private String name, address;
	
	public Student(int rollNo, String name, String address) {
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
	}
	
	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", address=" + address + "]";
	}
	
}

// To sort the student details in ascending order according to the rollNo
// all the elements of the Student array must be implements Comparable interface
class SortByRoll implements Comparator<Student> {

	// compare() method compare two objects lexicographically and return the one which has large value
	@Override
	public int compare(Student o1, Student o2) {
		
		// compare(int x, int y)
		// returns the value 0 if x == y; a value less than 0 if x < y; and a value greater than 0 if x > y
		return Integer.compare(o1.getRollNo(), o2.getRollNo());
		
		// In this way, a compare(int x, int y) method will work
//		if (o1.getRollNo() == o2.getRollNo())
//			return 0;
//		
//		else if (o1.getRollNo() < o2.getRollNo())
//			return -1;
//		
//		else // o1.getRollNo() > o2.getRollNo()
//			return 1;
	}
	
}

// sorting all the students according to the student name lexicographically i.e. in the dictionary order
class SortByName implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		
		// compareTo() method is used to compare the two strings lexicographically
		
		return o1.getName().compareTo(o2.getName());
	}
	
}

public class ArrayOfObjects {

	public static void main(String[] args) {
		
		try {
			Student[] arr = {
					new Student(80, "Niraj", "Nepal"),
					new Student(70, "Sushant", "Ktm"),
					new Student(50, "Nikesh", "Bajhang"),
					new Student(60, "Sagar", "Mnr"),
			};
			
			System.out.println("Student details before sorting: ");
			for (Student item: arr) {
				System.out.println(item);
			}
			
			// Sorting Student[] array object using Comparator<Student>
//			Arrays.sort(arr, new SortByRoll());
//			System.out.println("\nSorting all the students acc to the roll number: ");
//			for (Student item: arr) {
//				System.out.println(item);
//			}
			
			Arrays.sort(arr, new SortByName());
			System.out.println("\nSorting all the students acc to the name: ");
			for (Student item: arr) {
				System.out.println(item);
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





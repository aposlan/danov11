package danov11;

import java.io.Serializable;

public class Student extends Person implements Serializable{

	int faknum;
	Course[] courses;
	double[] grades;
	
	Student(String name, String phone, int faknum) {
		super(name, phone);
		this.faknum = faknum;
		this.courses = new Course[30];
		this.grades = new double[30];
	}
	
	public String toString() {
		return getName() + ", " + phone + ", " + faknum;
	}
	
}

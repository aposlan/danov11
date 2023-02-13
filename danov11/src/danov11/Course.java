package danov11;

import java.io.Serializable;

public class Course implements Serializable{

	private String name;
	private Teacher tutor;
	
	Course(String name, Teacher tutor){
		this.name = name;
		this.tutor = tutor;
	}
	
}

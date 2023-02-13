package danov11;

import java.io.Serializable;

public class Teacher extends Person implements Serializable{

	public String position;
	
	Teacher(String name, String phone, String position) {
		super(name, phone);
		this.position = position;
	}

	Teacher(String name, String phone){
		super(name, phone);
		this.position = "ASSISTANT";
	}
	
	public String toString() {
		return getName() + ", " + phone + ", " + position;
	}
	
}

package danov11;

import java.io.Serializable;

public class Person implements Serializable{

	private String name; 
	public String phone;
	
	Person(String name, String phone){
		this.name = name;
		this.phone = phone;
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		return name + ", " + phone;
	}
	
}

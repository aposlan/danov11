package danov11;

import java.io.*;

public class App {

	public static void main(String[] args) throws IOException {
		
		Student s1 = new Student("ivancho", "100520", 1112);
		Student s2 = new Student("mariq", "127625", 1113);
		
		Teacher t1 = new Teacher("Mihail", "10056126", "uchitel");
		
		Person[] p = {s1, s2, t1};
		
		FileOutputStream fos = new FileOutputStream("file.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.
		
		
		System.out.println(p[0]);
		System.out.println(p[1]);
		System.out.println(p[2]);
		
	}

}

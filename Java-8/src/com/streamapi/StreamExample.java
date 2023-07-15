/**
 * 
 */
package com.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author AR
 *
 */
class Student {
	int rollno;
	String name;
	String gender;

	public Student(int rollno, String name, String gender) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.gender = gender;
	}
}

class StreamExample {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(1, "Abdullah", "Male"));
		list.add(new Student(2, "Adil", "Male"));
		list.add(new Student(3, "Fatima", "Female"));
		List<Integer> list2 = list.stream().filter(p -> p.rollno > 1).map(l -> l.rollno).collect(Collectors.toList());
		System.out.println(list2);

	}

}

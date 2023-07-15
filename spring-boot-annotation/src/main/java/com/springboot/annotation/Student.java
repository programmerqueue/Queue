/**
 * 
 */
package com.springboot.annotation;

import org.springframework.stereotype.Component;

/**
 * @author AR
 *
 */
@Component
public class Student {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void reading() {
		System.out.println("I am currently reading a book:");
	}

	public void showing() {
		System.out.println("I am currently showing a book:");
	}

	public Student(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}

	public Student() {
		super();
	}
}

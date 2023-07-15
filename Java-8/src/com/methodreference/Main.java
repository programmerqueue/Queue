/**
 * 
 */
package com.methodreference;

/**
 * @author AR
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("process");
		Provider provider = Student::new;
		Student student = provider.getStudent();
		student.m1();

	}

}

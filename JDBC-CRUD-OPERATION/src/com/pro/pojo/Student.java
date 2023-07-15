/**
 * 
 */
package com.pro.pojo;

/**
 * @author AR
 *
 */
public class Student {
	private int rollno;
	private String name;
	private String college;
	private String gender;

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Student() {
		super();
	}

	public Student(int rollno, String name, String college, String gender) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.college = college;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", college=" + college + ", gender=" + gender + "]";
	}

}

/**
 * 
 */
package com.springcore.lifecycleofbean;

/**
 * @author Abdul Razzaque M
 *
 */
public class StudentByXml {
	private String name;
	private int rollno;
	private String College;
	private String City;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Setting value of name:");
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		System.out.println("setting value of rollno:");
		this.rollno = rollno;
	}

	public String getCollege() {
		System.out.println();
		return College;
	}

	public void setCollege(String college) {
		System.out.println("setting value of college");
		College = college;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		System.out.println("setting value of city:");
		City = city;
	}

	public StudentByXml(String name, int rollno, String college, String city) {
		super();
		this.name = name;
		this.rollno = rollno;
		College = college;
		City = city;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + ", College=" + College + ", City=" + City + "]";
	}

	public StudentByXml() {
		super();

	}

	public void init() {
		System.out.println("inside init method:");
	}

	public void destroy() {
		System.out.println("inside destroy method:");
	}
}

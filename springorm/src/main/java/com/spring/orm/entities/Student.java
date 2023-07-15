/**
 * 
 */
package com.spring.orm.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Abdul Razzaque M
 *
 */
@Entity
@Table(name = "Student_Details")
public class Student {
	@Id
	@Column(name = "Student_Id")
	private int Id;
	@Column(name = "Student_Name")
	private String Name;
	@Column(name = "Student_City")
	private String City;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	@Override
	public String toString() {
		return "Student [Id=" + Id + ", Name=" + Name + ", City=" + City + "]";
	}

	public Student() {
		super();
	}

	public Student(int id, String name, String city) {
		super();
		Id = id;
		Name = name;
		City = city;
	}
}

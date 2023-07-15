/**
 * 
 */
package com.pro.main;

import java.util.List;

import com.pro.dao.StudentDao;
import com.pro.daoimpl.StudentDaoImpl;
import com.pro.pojo.Student;

/**
 * @author AR
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		insert
		Student student = new Student();
//		student.setRollno(7);
//		student.setName("Mohsin Shaikh");
//		student.setCollege("St. Xaviers College");
//		student.setGender("Male");
//		System.out.println(student.toString());
		StudentDao studentDao = new StudentDaoImpl();
//		studentDao.create(student);

//		read
//		List<Student> list = studentDao.read();
//		for (Student s : list) {
//			System.out.println(s.toString());
//		}

//		update
//		student.setRollno(2);
//		student.setName("Ammar Syed");
//		System.out.println(student.getName());
//		System.out.println(student.toString());
//		studentDao.update(student);
		
//		delete
		student.setRollno(7);
		studentDao.delete(student);
	}
}
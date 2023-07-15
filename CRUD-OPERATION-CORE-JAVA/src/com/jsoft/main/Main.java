/**
 * 
 */
package com.jsoft.main;

import java.util.List;

import com.jsoft.dao.StudentDao;
import com.jsoft.daoImpl.StudentImpl;
import com.jsoft.pojo.Student;

/**
 * @author AR
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Student student = new Student();
//		student.setRollno(5);
//		student.setName("Suhana");
//		student.setCollege("Ismail Yusuf");
//		student.setGender("Female");
//		System.out.println(student);
		StudentDao studentdao = new StudentImpl();
//		studentdao.create(student);
//		List<Student> list = studentdao.read();
//		for (Student s : list) {
//			System.out.println("record is : " + s);
//		}
		
//		 update
		studentdao.update(student);
		student.setName("Abdul Rehman");
		System.out.println(student.getName());
		System.out.println(student.toString());
		
//       // delete 
//		studentdao.delete(student);
		
	}

}

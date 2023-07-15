/**
 * 
 */
package com.spring.orm.dao;

import java.util.List;

import com.spring.orm.entities.Student;

/**
 * @author Abdul Razzaque M
 *
 */
public interface StudentDao {
	public int insert(Student student);

	public List<Student> getAllStudents();

	public Student getStudent(int userId);

	public void deleteStudent(int d);

	public void updateStudent(Student s1);

}
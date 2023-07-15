/**
 * 
 */
package com.spring.orm.daoImpl;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.orm.hibernate5.HibernateTemplate;
import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

/**
 * @author Abdul Razzaque M
 *
 */
public class StudentDaoImpl implements StudentDao {
	private HibernateTemplate hibernateTemplate;

	// save Student
	@Transactional
	public int insert(Student student) {
		// insert
		Integer i = (Integer) this.hibernateTemplate.save(student);
		return i;
	}

	// get the single data(object)
	public Student getStudent(int studentId) {
		Student student = this.hibernateTemplate.get(Student.class, studentId);
		return student;
	}

	// get all multiple data(object)
	public List<Student> getAllStudents() {
		List<Student> list = this.hibernateTemplate.loadAll(Student.class);
		return list;
	}

	// deleting the data(object)
	@Transactional
	public void deleteStudent(int studentId) {
		Student student = this.hibernateTemplate.get(Student.class, studentId);
		this.hibernateTemplate.delete(student);
	}

	// updating the data(object)
	@Transactional
	public void updateStudent(Student student) {
		this.hibernateTemplate.update(student);
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

}

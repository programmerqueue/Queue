/**
 * 
 */
package com.criteria;

import java.util.List;


import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import ProjectWithMaven.first.Student;

/**
 * @author AR
 *
 */
public class CriteriaExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Criteria c = session.createCriteria(Student.class);
//		c.add(Restrictions.eq("certi.course", "Spring Boot"));
//		c.add(Restrictions.gt("id", 6767));
//		c.add(Restrictions.lt("id", 6767));
		c.add(Restrictions.like("certi.course", "Django"));
		List<Student> list = c.list();
		for (Student s : list) {
			System.out.println(s);
		}
		session.close();

	}

}

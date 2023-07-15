/**
 * 
 */
package com.map.manytomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * @author AR
 *
 */
public class MappingDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		Emp emp1 = new Emp();
		emp1.setEid(34);
		emp1.setName("Abdullah");

		Emp emp2 = new Emp();
		emp2.setEid(35);
		emp2.setName("Asif");

		Project project1 = new Project();
		project1.setPid(12121);
		project1.setProjectName("Fee Report");

		Project project2 = new Project();
		project2.setPid(14214);
		project2.setProjectName("Library Management System");

		List<Emp> list1 = new ArrayList<Emp>();
		List<Project> list2 = new ArrayList<Project>();
		list1.add(emp1);
		list1.add(emp2);
		list2.add(project1);
		list2.add(project2);

		emp1.setProjects(list2);
		project2.setEmps(list1);

		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(emp1);
		session.save(emp2);
		session.save(project1);
		session.save(project2);
		transaction.commit();
		session.close();
	}

}

/**
 * 
 */
package com.firstlevelcache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import ProjectWithMaven.first.Student;

/**
 * @author AR
 *
 */
public class FirstDemoCache {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Student student = session.get(Student.class, 303);
		System.out.println(student);
		System.out.println("working something...");

//		same object hitting 

		Student student2 = session.get(Student.class, 303);
		System.out.println(student2);
		System.out.println(session.contains(student2));

		session.close();

	}

}

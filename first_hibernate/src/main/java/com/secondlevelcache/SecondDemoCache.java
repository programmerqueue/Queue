/**
 * 
 */
package com.secondlevelcache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import ProjectWithMaven.first.Employee;

/**
 * @author AR
 *
 */
public class SecondDemoCache {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();
		Employee employee = session.get(Employee.class, 1);
		System.out.println(employee);
		session.close();

		Session session1 = factory.openSession();
		Employee employee6 = session.get(Employee.class, 1);
		System.out.println(employee6);
		session1.close();

		factory.close();

	}

}

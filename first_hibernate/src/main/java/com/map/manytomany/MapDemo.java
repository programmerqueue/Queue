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
public class MapDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		Question q = new Question();
		q.setQname("What is Java?");

		Answer an1 = new Answer();
		an1.setAnswername("Java is a programming Language");
		an1.setPostedBy("Makrani");

		Answer an2 = new Answer();
		an2.setAnswername("Java is a platform");
		an2.setPostedBy("Sudhir Kumar");

		List<Answer> list = new ArrayList<Answer>();
		list.add(an1);
		list.add(an2);
		q.setAnswer(list);

		Question q2 = new Question();
		q2.setQname("What is Servlet?");

		Answer an3 = new Answer();
		an3.setAnswername("Servlet is an Interface");
		an3.setPostedBy("Salman khan");

		Answer an4 = new Answer();
		an4.setAnswername("Servlet is an API");
		an4.setPostedBy("Arun");

		List<Answer> list1 = new ArrayList<Answer>();
		list1.add(an3);
		list1.add(an4);
		q2.setAnswer(list1);
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(q);
		session.save(q2);
		session.save(an1);
		session.save(an2);
		session.save(an3);
		session.save(an4);
		transaction.commit();
		session.close();
		factory.close();
	}

}

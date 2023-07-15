/**
 * 
 */
package com.map.manytoone;

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
		Question q1 = new Question();
		q1.setQ_id(1);
		q1.setQ_name("What is the Capital of Israel?");
		Question q2 = new Question();
		q2.setQ_id(2);
		q2.setQ_name("What is the Capital of Palestine?");
		Answer a1 = new Answer();
		a1.setAns_id(11);
		a1.setAns("Jerusalem");
		q1.setAnswer(a1);
		q2.setAnswer(a1);
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(q1);
		session.save(q2);
		session.save(a1);
		transaction.commit();
		session.close();
		factory.close();

	}

}

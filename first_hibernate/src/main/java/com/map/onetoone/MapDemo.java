/**
 * 
 */
package com.map.onetoone;

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

		Question question = new Question();
		question.setQuestionId(1212);
		question.setQuestion("What is Hibernate?");
		Answer answer = new Answer();
		answer.setAnswerId(343);
		answer.setAnswer("Hibernate is a java framework");
		question.setAnswer(answer);

		Question question1 = new Question();
		question1.setQuestionId(242);
		question1.setQuestion("What is API?");
		Answer answer1 = new Answer();
		answer1.setAnswerId(344);
		answer1.setAnswer("API is used to interact with the application");
		question1.setAnswer(answer1);

		Question question2 = new Question();
		question2.setQuestionId(243);
		question2.setQuestion("What is stands for JDBC?");
		Answer answer2 = new Answer();
		answer2.setAnswerId(350);
		answer2.setAnswer("Java Database Connectivity");
		question2.setAnswer(answer2);

		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(question);
		session.save(question1);
		session.save(question2);
		session.save(answer);
		session.save(answer1);
		session.save(answer2);
		transaction.commit();
		factory.close();
	}

}

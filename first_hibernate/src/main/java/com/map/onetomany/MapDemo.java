/**
* 
*/
package com.map.onetomany;

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
		q.setQuestionId(2002);
		q.setQuestion("What is JVM?");

		Answer a = new Answer();
		a.setAnswerId(1002);
		a.setAnswer("Java Virtual Machine");
		a.setQuestion(q);

		Answer a1 = new Answer();
		a1.setAnswerId(1003);
		a1.setAnswer("JVM is part of JRE");
		a1.setQuestion(q);

		Answer a2 = new Answer();
		a2.setAnswerId(1004);
		a2.setAnswer(
				"Jvm is an abstract machine which is used to specification to provide runtime environment in which the java bytcode to be executed");
		a2.setQuestion(q);

		List<Answer> list = new ArrayList<Answer>();
		list.add(a);
		list.add(a1);
		list.add(a2);
		q.setAnswer(list);

		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();
		session.save(q);
		session.save(a);
		session.save(a1);
		session.save(a2);
		transaction.commit();

		Question question = (Question) session.get(Question.class, 201);
		System.out.println(question.getQuestionId());
		System.out.println(question.getQuestion());
//		System.out.println(question.getAnswer().size());
//		for (Answer ans : question.getAnswer()) {
//			System.out.println(ans.getAnswer());
//		}
		session.close();
		factory.close();

	}
}
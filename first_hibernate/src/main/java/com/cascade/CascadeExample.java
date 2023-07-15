/**
 * 
 */
package com.cascade;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.map.onetomany.Answer;
import com.map.onetomany.Question;

/**
 * @author AR
 *
 */
public class CascadeExample {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Question question = new Question();
		question.setQuestionId(568);
		question.setQuestion("What is Swing Framework?");
		Answer answer = new Answer();
		answer.setAnswerId(23424);
		answer.setAnswer("Use for Development");

		Answer answer1 = new Answer();
		answer1.setAnswerId(256);
		answer1.setAnswer("Desktop");

		Answer answer2 = new Answer();
		answer2.setAnswerId(36);
		answer2.setAnswer("Learn for Programmer");

		List<Answer> list = new ArrayList<Answer>();
		list.add(answer);
		list.add(answer1);
		list.add(answer2);
		question.setAnswer(list);
		Transaction transaction = session.beginTransaction();
		session.save(question);
		transaction.commit();
		session.close();
		factory.close();
	}

}

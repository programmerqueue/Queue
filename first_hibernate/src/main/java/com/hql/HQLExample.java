/**
 * 
 */
package com.hql;

import java.util.Arrays;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import ProjectWithMaven.first.Student;

/**
 * @author AR
 *
 */
public class HQLExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		// Fetching the record
//
////		String query = "from Student";    //with direct using object 
////		String query = "from Student where city='Kolkata'";    //with direct using object 
////		String query = "from Student where city=:x";           //without direct using object
//		String query = "from Student as a where a.city=:x and a.name=:y";
//		Query<Student> createQuery = session.createQuery(query);
//		createQuery.setParameter("x", "Odisha");
//		createQuery.setParameter("y", "Mustaq");
//		List<Student> list1 = createQuery.list();
		
//		for (Student student : list1) {
//			System.out.println(student.getName() + " " + student.getCity());
//		}

		// Delete the record

//		Transaction transaction = session.beginTransaction();
//		String query1 = "delete from Student s where s.id=:n";
//		Query createQuery2 = session.createQuery(query1);
//		createQuery2.setParameter("n", 1212);
//		int i = createQuery2.executeUpdate();
//		System.out.println("deleted" + i);
//		transaction.commit();
		
		// Update the record
		
//		Transaction transaction = session.beginTransaction();
//		String query2 = "update Student s set s.city=:x where s.name=:k";
//		Query createQuery3 = session.createQuery(query2);
//		createQuery3.setParameter("x", "Mumbai");
//		createQuery3.setParameter("k", "khalid");
//		int update = createQuery3.executeUpdate();
//		System.out.println("record is updated:" + update);
//		transaction.commit();
		
		// How to execute join query
		
		String query3 = "select q.question,q.questionId,a.answer from Question as q INNER JOIN q.answer as a";
		Query<Object[]> createQuery4 = session.createQuery(query3);
		List<Object []> resultList = createQuery4.getResultList();	
		for(Object[] arr : resultList) {
			System.out.println(Arrays.toString(arr));
		}
		session.close();
		factory.close(); 
	}

}

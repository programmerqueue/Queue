/**
 * 
 */
package com.sqlnativequery;

import java.util.Arrays;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

/**
 * @author AR
 *
 */
public class SqlExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		String query1 = "select * from student";
		NativeQuery<Object[]> createSQLQuery = session.createSQLQuery(query1);
		List<Object[]> list = createSQLQuery.list();
		for (Object[] obj : list) {
			System.out.println(Arrays.toString(obj));
//			System.out.println(obj[1] + " : " + obj[4]);
		}
		session.close();
		factory.close();
	}

}

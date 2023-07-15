/**
 * 
 */
package ProjectWithMaven.first;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * @author AR
 *
 */
public class EmDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Student student = new Student();
		student.setId(14134);
		student.setName("Mastani");
		student.setCity("Hyderabad");
		Certificate certificate = new Certificate();
		certificate.setCourse("Java");
		certificate.setDuration("2 months");
		student.setCerti(certificate);
		
		Student student1 = new Student();
		student1.setId(1212);
		student1.setName("Mustaq");
		student1.setCity("Odisha");
		Certificate certificate1 = new Certificate();
		certificate1.setCourse("Python");
		certificate1.setDuration("3 months");
		student.setCerti(certificate1);
		
		Student student2 = new Student();
		student2.setId(303);
		student2.setName("Makrani");
		student2.setCity("Kolkata");
		Certificate certificate2 = new Certificate();
		certificate2.setCourse("Node.js");
		certificate2.setDuration("4 months");
		student2.setCerti(certificate2);
		
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(student);
		session.save(student1);
		session.save(student2);
		transaction.commit();
		session.close();
		factory.close();

	}

}

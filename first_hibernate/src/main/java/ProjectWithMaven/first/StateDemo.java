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
public class StateDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
//		Transient State
		Student st = new Student();
		st.setId(6767);
		st.setName("Haris Sohail");
		st.setCity("Chennai");

		Certificate certificate = new Certificate();
		certificate.setCourse("Spring Boot");
		certificate.setDuration("1 month");
		st.setCerti(certificate);
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
//      Persistent state
		session.save(st);
		st.setName("Khalid"); //update the object in the database
		transaction.commit();
		
//		Detached state
        session.close();
        st.setName("abc");
        System.out.println(st);
		factory.close();
	}

}

/**
 * 
 */
package ProjectWithMaven.first;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author AR
 *
 */
public class FetchDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Student student = (Student) session.load(Student.class, 1);
		System.out.println(student);
		Address address = (Address) session.get(Address.class, 104);
		System.out.println(address);
		session.close();
		factory.close();

	}

}

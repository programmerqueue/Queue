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
public class EmpMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("Abdullah");
		employee.setCity("Mumbai");
		employee.setCompany("Tcs");

		Employee employee1 = new Employee();
		employee1.setId(2);
		employee1.setName("Abdul Rahim");
		employee1.setCity("Pune");
		employee1.setCompany("Relaince");

		Employee employee2 = new Employee();
		employee2.setId(3);
		employee2.setName("Abdul Razzaque");
		employee2.setCity("Hyderabad");
		employee2.setCompany("Kolkata");

		Employee employee3 = new Employee();
		employee3.setId(4);
		employee2.setName("Abdul Rouf");
		employee3.setCity("Chennai");
		employee3.setCompany("Citius Tech");
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(employee);
		session.save(employee1);
		session.save(employee2);
		session.save(employee3);
		transaction.commit();
		session.close();
		factory.close();

	}

}

package ProjectWithMaven.first;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws IOException {
		System.out.println("Hello World!");
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
//		System.out.println(factory);
//		System.out.println(factory.isClosed());
//		System.out.println(factory.isOpen());
		Student st = new Student();
		st.setId(104);
		st.setName("Abdul Rouf");
		st.setCity("Kolkata");
		System.out.println(st);
		Address add = new Address();
		add.setStreet("chinckpokli");
		add.setCity("Pune");
		add.setOpen(true);
		Date d = new Date();
		add.setAddedDate(d);
		add.setX(1234.34);

		FileInputStream fis = new FileInputStream("C:\\Users\\AR\\Downloads\\images.png");

		byte[] data = new byte[fis.available()];
		fis.read(data);
		add.setImage(data);
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(st);
		session.save(add);
		tx.commit();
		session.close();
	}
}

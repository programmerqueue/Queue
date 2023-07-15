package com.spring.orm;

import java.io.BufferedReader;

import java.io.InputStreamReader;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.orm.dao.StudentDao;
import com.spring.orm.daoImpl.StudentDaoImpl;
import com.spring.orm.entities.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		StudentDao studentDao = context.getBean("studentDaoImpl", StudentDaoImpl.class);
//		Student student = new Student();
//		student.setId(113);
//		student.setName("Abdul Sattar");
//		student.setCity("Hyderabad");
//		int i = studentDao.insert(student);
//		System.out.println("record is inserted:" + i);
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		boolean bn = true;
		while (bn) {
			System.out.println("PRESS 1 for add new student/insert");
			System.out.println("PRESS 2 for display all students");
			System.out.println("PRESS 3 for get detail of single student");
			System.out.println("PRESS 4 for delete students");
			System.out.println("PRESS 5 for update students");
			System.out.println("PRESS 6 for exit");
			try {
				int input = Integer.parseInt(br.readLine());
				switch (input) {
				case 1:
					// add new student/insert
					// taking inputs from users
					System.out.println("Enter user id:");
					int uId = Integer.parseInt(br.readLine());
					System.out.println("Enter user name:");
					String uName = br.readLine();
					System.out.println("Enter user city:");
					String uCity = br.readLine();

					// creating student object and setting values
					Student s = new Student();
					s.setId(uId);
					s.setName(uName);
					s.setCity(uCity);

					// saving student object to database by calling insert of student dao
					int i = studentDao.insert(s);
					System.out.println("student added:" + i);
					System.out.println("**************************************");
					System.out.println();
					break;
				case 2:

					// display all students
					System.out.println("*****************************************");
					List<Student> allStudents = studentDao.getAllStudents();
					for (Student st : allStudents) {
						System.out.println("Id :" + st.getId());
						System.out.println("Name :" + st.getName());
						System.out.println("City :" + st.getCity());
						System.out.println("_____________________________________");
					}
					System.out.println("*****************************************");
					break;
				case 3:
					// get detail of single student
					System.out.println("Enter user id :");
					int userId = Integer.parseInt(br.readLine());
					Student student = studentDao.getStudent(userId);
					System.out.println("Id :" + student.getId());
					System.out.println("Name :" + student.getName());
					System.out.println("City :" + student.getCity());
					System.out.println("_____________________________________");

					break;
				case 4:
					// delete student
					System.out.println("Enter user id :");
					int d = Integer.parseInt(br.readLine());
					studentDao.deleteStudent(d);
					System.out.println("Student deleted......");
					System.out.println("_____________________________________");
					break;
				case 5:
					// update student
					System.out.println("Enter user id:");
					int uId1 = Integer.parseInt(br.readLine());
					System.out.println("Enter user name:");
					String uName1 = br.readLine();
					System.out.println("Enter user city:");
					String uCity1 = br.readLine();
					Student s1 = new Student();
					s1.setId(uId1);
					s1.setName(uName1);
					s1.setCity(uCity1);
					studentDao.updateStudent(s1);
					System.out.println("updated student : " + studentDao);
					System.out.println("_____________________________________");
					break;

				case 6:
					// exit
					bn = false;
					break;
				}
			} catch (Exception e) {
				System.out.println("Invalid Input Try with another one!!");
				System.out.println(e.getMessage());
			}
		}
		System.out.println("thankyou for using my application");
		System.out.println("see you soon");
	}
}
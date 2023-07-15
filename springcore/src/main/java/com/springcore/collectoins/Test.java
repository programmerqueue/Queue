/**
 * 
 */
package com.springcore.collectoins;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Abdul Razzaque M
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com//springcore//collectoins//collectionconfig.xml");
		Emp emp = (Emp) context.getBean("emp1");
		System.out.println(emp.getName());
		System.out.println(emp.getAddresses());
		System.out.println(emp.getCourses());
		System.out.println(emp.getPhones().getClass().getName());

	}

}

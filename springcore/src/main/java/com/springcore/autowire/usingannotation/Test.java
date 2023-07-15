/**
 * 
 */
package com.springcore.autowire.usingannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Abdul Razzaque M
 *
 */
public class Test {

	public static void main(String[] args) {
		ApplicationContext c1 = new ClassPathXmlApplicationContext(
				"com//springcore//autowire//usingannotation//autoconfig.xml");
		Emp e = c1.getBean("emp1", Emp.class);
		System.out.println(e);
	}
}
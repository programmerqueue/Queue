/**
 * 
 */
package com.springcore.autowire.usingxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Abdul Razzaque M
 *
 */
public class Test {

	public static void main(String[] args) {
		ApplicationContext c = new ClassPathXmlApplicationContext(
				"com\\springcore\\autowire\\usingxml\\autowireconfig.xml");
		Emp e = c.getBean("emp1", Emp.class);
		System.out.println(e);
	}

}

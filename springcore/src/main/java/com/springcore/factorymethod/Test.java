/**
 * 
 */
package com.springcore.factorymethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Abdul Razzaque M
 *
 */
public class Test {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com//springcore//factorymethod//ApplicationContext.xml");
//		A a = (A) context.getBean("a");
		Printable p = (Printable)context.getBean("pf");
		p.print();
	}
}
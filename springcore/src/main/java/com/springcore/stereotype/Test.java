/**
 * 
 */
package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author AR
 *
 */
public class Test {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com//springcore//stereotype//stereoconfig.xml");
		
		/* Using bean Scope through annotation */
		
//		Student student = context.getBean("obj", Student.class);
//		Student student1 = context.getBean("obj", Student.class);
//		System.out.println(student);
//		System.out.println("----------------------------------------------------------------------------");
//		System.out.println(student.getAddress());
//		System.out.println(student.getAddress().getClass().getName());
//		System.out.println(student.hashCode());
//		System.out.println(student1.hashCode());
		
		/* Using bean Scope through xml */
		
		Teacher teacher = context.getBean("teacher", Teacher.class);
		Teacher teacher1 = context.getBean("teacher", Teacher.class);
		System.out.println(teacher.hashCode());
		System.out.println(teacher1.hashCode());
	}
}
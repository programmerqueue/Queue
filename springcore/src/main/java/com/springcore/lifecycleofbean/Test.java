/**
 * 
 */
package com.springcore.lifecycleofbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Abdul Razzaque M
 *
 */
public class Test {

	public static void main(String[] args) {
		
AbstractApplicationContext context = new ClassPathXmlApplicationContext("com//springcore//lifecycleofbean//config.xml");
context.registerShutdownHook();
//StudentByXml s= (StudentByXml)context.getBean("stnd");
//System.out.println(s);
//EmployeeByInterface e = (EmployeeByInterface)context.getBean("e1");
//System.out.println(e);
ExampleByAnnotation ex1 = (ExampleByAnnotation)context.getBean("ex");
System.out.println(ex1);
	}

}

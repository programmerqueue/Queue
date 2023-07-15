/**
 * 
 */
package com.springcore.ambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Abdul Razzaque M
 *
 */
public class Test {

	public static void main(String[] args) {
		
ApplicationContext context= new ClassPathXmlApplicationContext("com//springcore//ambiguity//constructorinjectionambiguity.xml");
Addition a=(Addition)context.getBean("add");
a.doSum();
	}

}

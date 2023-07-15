/**
 * 
 */
package com.springcore.referencetype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Abdul Razzaque M
 *
 */
public class C {


	public static void main(String[] args) {
	ApplicationContext c =	new ClassPathXmlApplicationContext("com//springcore//referencetype//refconfig.xml");
 A a = (A)c.getBean("aref");
   System.out.println(a.getX());
   System.out.println(a.getObj().getY());
   System.out.println(a.getObj());
      	
	}


	}



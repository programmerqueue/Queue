/**
 * 
 */
package com.springcore.factorymethod;

/**
 * @author Abdul Razzaque M
 *
 */
public class A {  //this is a singleton class
	private static final A obj= new A();
	private A() {
		System.out.println("private constructor:");
	}
public static A getA() {
	return obj;
}
public void msg() {
	System.out.println("hello user:");
}
}

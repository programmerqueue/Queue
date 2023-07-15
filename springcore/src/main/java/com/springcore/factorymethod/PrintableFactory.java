/**
 * 
 */
package com.springcore.factorymethod;

/**
 * @author Abdul Razzaque M
 *
 */
public class PrintableFactory {
public Printable getPrintable() {
	return new C();
}
}

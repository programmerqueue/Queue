/**
 * 
 */
package com.springcore.constructorinjection;

/**
 * @author Abdul Razzaque M
 *
 */
public class Certi {
String name;

public Certi(String name) {
	super();
	this.name = name;
}

@Override
public String toString() {
	return "Certi [name=" + name + "]";
}
}
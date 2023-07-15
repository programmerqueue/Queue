/**
 * 
 */
package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author AR
 *
 */
@Component("obj")
public class Demo {
	@Value("#{22 + 28}")
	private int x;
	@Value("#{62 + 38}")
	private int y;
	@Value("#{T(java.lang.Math).sqrt(144)}")
	private double z;
	@Value("#{T(java.lang.Math).PI}")
	private double a;
	@Value("#{new java.lang.String('Abdullah')}")
	private String name;

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", a=" + a + ", name=" + name + "]";
	}
}

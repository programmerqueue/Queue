/**
 * 
 */
package com.springcore.autowire.usingannotation;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Abdul Razzaque M
 *
 */
public class Emp {
	
	private Address address;

	public Address getAddress() {
		return address;
	}
	@Autowired
	public void setAddress(Address address) {
		System.out.println("setting value:");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

	public Emp() {
		super();

	}

	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("inside constructor:");
	}

}

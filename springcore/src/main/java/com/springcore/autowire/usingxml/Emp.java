/**
 * 
 */
package com.springcore.autowire.usingxml;

/**
 * @author Abdul Razzaque M
 *
 */
public class Emp {
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
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

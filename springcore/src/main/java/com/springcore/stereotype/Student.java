/**
 * 
 */
package com.springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author AR
 *
 */
@Component("obj")
@Scope("prototype")
public class Student {
	@Value("Abdullah")
	private String name;
	@Value("Mumbai")
	private String city;
	@Value("Maharastra")
	private String state;
	@Value("India")
	private String country;
	@Value("#{temp}")
	private List<String> address;

	public List<String> getAddress() {
		return address;
	}

	public void setAddress(List<String> address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + ", state=" + state + ", country=" + country + ", address="
				+ address + "]";
	}

}

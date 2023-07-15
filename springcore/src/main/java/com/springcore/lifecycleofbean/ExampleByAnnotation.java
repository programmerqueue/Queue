/**
 * 
 */
package com.springcore.lifecycleofbean;

import javax.annotation.PostConstruct;

import javax.annotation.PreDestroy;

/**
 * @author Abdul Razzaque M
 *
 */
public class ExampleByAnnotation {
	String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Example [subject=" + subject + "]";
	}

	public ExampleByAnnotation() {
		super();

	}

	@PostConstruct
	public void start() {
		System.out.println("taking start");
	}

	@PreDestroy
	public void end() {
		System.out.println("taking end");
	}
}

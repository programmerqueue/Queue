/**
* 
*/
package com.springboot.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

/**
 * @author AR
 *
 */
@Configuration
@ComponentScan(basePackages = { "com.mypack" })
public class MyConfig {
	@Bean("Student1")
	@Lazy
	public Student getStudent() {
		System.out.println("creating instantiate of Student1:");
		return new Student("Student1");
	}

	@Bean("Student2")

	public Student createName() {
		System.out.println("creating instantiate of Student2:");
		return new Student("Abdullah");
	}

	@Bean
	public Date getDate() {
		System.out.println("creating instantiate of Date:");
		return new Date();
	}
}

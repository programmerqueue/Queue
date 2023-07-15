package com.springboot.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mypack.Animal;

@SpringBootApplication
public class SpringBootAnnotationApplication implements CommandLineRunner {
	@Autowired
	@Qualifier("Student1")
	private Student student;
	@Autowired
	private Date date;
	@Autowired
	private Emp emp;
	@Autowired
	private Animal animal;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAnnotationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(student.toString());
		this.student.reading();
		this.student.showing();
		this.date.date();
		this.emp.name();
		this.animal.dog();
	}

}

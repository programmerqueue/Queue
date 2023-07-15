/**
 * 
 */
package com.springboot.annotation.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.annotation.Student;

/**
 * @author AR
 *
 */
@RestController
public class MyController {
	@Autowired
	@Qualifier("Student1")
	private Student student;

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public Student home(@RequestBody Student st) {
		st.reading();
		System.out.println(st);
		this.student.setName("Makrani");
		return this.student;
	}
}

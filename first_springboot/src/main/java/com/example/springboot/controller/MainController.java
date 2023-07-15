/**
 * 
 */
package com.example.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author AR
 *
 */
@Controller
public class MainController {
	@RequestMapping("/first_home")
	public String firstHandler() {
		System.out.println("this is my first home page");
		return "home";
	}

	@RequestMapping("/contact")
	public String secondHandler() {
		System.out.println("this is my first contact page");
		return "contact";
	}
}

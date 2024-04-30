package com.spring.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/persons")
	public String mathod() {
		return "home";
	}
}

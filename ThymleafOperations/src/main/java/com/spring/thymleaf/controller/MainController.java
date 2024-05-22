package com.spring.thymleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("/show")
	public String show() {
		
		return "index";
	}
	@GetMapping("/about")
	public String about() {
		
		return "about";
	}
	@GetMapping("/contact")
	public String contact() {
		
		return "contact";
	}
	@GetMapping("/help")
	public String help() {
		
		return "help";
	}
	@GetMapping("/base")
	public String base() {
		
		return "Base";
	}
	@GetMapping("/newabout")
	public String newabout() {
		
		return "Newabout";
	}
}

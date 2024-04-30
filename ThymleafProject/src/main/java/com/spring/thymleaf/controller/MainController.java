package com.spring.thymleaf.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.Model;

@Controller
public class MainController {

	@RequestMapping(value = "/about",method = RequestMethod.GET)
	public String about(Model model) {
		
		model.addAttribute("name", "suman");
		return "About";
	}
	
	@GetMapping("/iterate")
	public String iterate(Model m) {
		
		List<String> names=List.of("a","b","c","d");
		m.addAttribute("names", names);
		return "Iterate";
	}
	
	@GetMapping("/condition")
	public String condition(Model model) {
		
		model.addAttribute("isActive", true);
		model.addAttribute("gender", "F");
		return "condition";
	}
	
	//including fragment
	@GetMapping("/fragment")
	public String fragment() {
		
		return "fagment";
	}
	
	//this is for base
	@GetMapping("/base")
	public String base() {
		return "NewAbout";
	}
}

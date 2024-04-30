package com.formvalidation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.formvalidation.model.Person;

import jakarta.validation.Valid;

@Controller
public class MainController {

	@GetMapping("/display")
	public String showForm(Person person) {
		return "sampleform";
	}
	
	@PostMapping("/")
	public String checkPersonInfo(@Valid Person person, BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {
			return "sampleform";
		}

		return "success";
	}
}

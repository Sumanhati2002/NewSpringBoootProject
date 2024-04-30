package com.spring.formvalidation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.spring.formvalidation.entity.FormEntity;

import jakarta.validation.Valid;


@Controller
public class FormController {

	@GetMapping("/showform")
	public String showForm() {
		return "Form";
	}

	@PostMapping("/users")
	public String getData(@Valid @ModelAttribute FormEntity formEntity, BindingResult bindingResult) {
		
		System.out.println(formEntity);
		if (bindingResult.hasErrors()) {
			return "Form";
		}
		else {
			return "success";
		}
	}

}

package com.spring.email.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.email.model.MyEmail;
import com.spring.email.service.EmailService;

@RestController
public class EmailController {

	 @Autowired
	 private EmailService emailService;
	 
	// Sending a simple Email
	    @PostMapping("/sendMail")
	    public String sendMail(@RequestBody MyEmail details)
	    {
	        String status = emailService.sendSimpleMail(details);
	        
	        return status;
	    }
}

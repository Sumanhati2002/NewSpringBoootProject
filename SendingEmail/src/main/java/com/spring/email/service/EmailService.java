package com.spring.email.service;

import com.spring.email.model.MyEmail;

public interface EmailService {

	// To send a simple email
	String sendSimpleMail(MyEmail details);
	 
    // To send an email with attachment
//    String sendMailWithAttachment(MyEmail details);
}

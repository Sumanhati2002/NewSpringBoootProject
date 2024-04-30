package com.spring.formvalidation.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FormEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Email(message = "must not be blank")
	private String email;
	
	@Size(min = 5, max = 10)
	@NotBlank(message = "please enter your password")
	private String password;
}

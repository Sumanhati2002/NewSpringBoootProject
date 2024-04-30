package com.spring.create.entity.entityclass.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.create.entity.entityclass.Employee;
import com.spring.create.entity.entityclass.repo.EmployeeRepository;
import com.spring.create.entity.entityclass.service.EmployeeService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("api/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping
    public ResponseEntity<Employee> createUser(@RequestBody Employee employee){
        Employee savedUser = employeeService.createUser(employee);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }
	
	
	
}

package com.spring.create.entity.entityclass.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.create.entity.entityclass.Employee;
import com.spring.create.entity.entityclass.repo.EmployeeRepository;
import com.spring.create.entity.entityclass.service.EmployeeService;

@Service
public class EmployeeImplimentation implements EmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public Employee createUser(Employee employee) {
		
		return employeeRepository.save(employee);
	}

//	@Override
//	public List<User> getAllUsers() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public User getUserById(int id) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public void deleteUser(int id) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public User updateUser(User user) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
}

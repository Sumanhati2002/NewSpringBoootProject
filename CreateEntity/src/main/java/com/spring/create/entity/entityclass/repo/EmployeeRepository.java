package com.spring.create.entity.entityclass.repo;


import org.springframework.data.repository.CrudRepository;

import com.spring.create.entity.entityclass.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer>{
	
}

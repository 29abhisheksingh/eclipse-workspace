package com.globallogic.Employee.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.globallogic.Employee.entity.EmployeeEntity;

@Service
public interface EmployeeServices {
	

	abstract public List<EmployeeEntity> getEmployee(); 

	
	abstract public void addEmployee(EmployeeEntity emp);
    

	abstract public void updateEmployee(EmployeeEntity emp);

	
	abstract public void deleteEmployee(long id);

}
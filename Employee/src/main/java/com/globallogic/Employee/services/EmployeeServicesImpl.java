package com.globallogic.Employee.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.globallogic.Employee.entity.EmployeeEntity;
import com.globallogic.Employee.repo.EmployeeRepo;

@Service
public class EmployeeServicesImpl implements EmployeeServices {

	@Autowired
	EmployeeRepo  employeeRepo;
	
	@Override
	public List<EmployeeEntity> getEmployee() {
		// TODO Auto-generated method stub
		return employeeRepo.findAll();
	}

	@Override
	public void addEmployee(EmployeeEntity emp) {
		// TODO Auto-generated method stub
		this.employeeRepo.save(emp);
	}

	@Override
	public void updateEmployee(EmployeeEntity emp) {
		// TODO Auto-generated method stub
		employeeRepo.save(emp);
		
	}

	@Override
	public void deleteEmployee(long id) {
		// TODO Auto-generated method stub
		employeeRepo.deleteById(id);
	}

}

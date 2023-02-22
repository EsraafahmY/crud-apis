package com.example.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crud.entity.Employees;
import com.example.crud.repository.EmployeeRepository;

@Service
public class EmployeesService {
	@Autowired
	private EmployeeRepository employeeRepository;

	public Employees createUser(Employees emp) {
		System.out.print("get All users");
		return employeeRepository.save(emp);
	}

	public Employees getUserById(int id) {
		return employeeRepository.findById(id).orElse(null);
	}

	public List<Employees> getUsers() {
		return employeeRepository.findAll();
	}
	
	public Employees updateEmployee(Employees emp) {
		Employees oldUser=null;
		Optional<Employees> optionaluser=employeeRepository.findById(emp.getId());
		if(optionaluser.isPresent()) {
			oldUser=optionaluser.get();
			oldUser.setFirstName(emp.getFirstName());
			oldUser.setLastName(emp.getLastName());
			oldUser.setPhoneNumer(emp.getPhoneNumer());
			employeeRepository.save(oldUser);
		}else {
			return new Employees();
		}
		return oldUser;
	}
	
	public String deleteUserById(int id) {
		employeeRepository.deleteById(id);
		return "User got deleted";
	}

}

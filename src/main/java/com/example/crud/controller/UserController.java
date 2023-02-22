package com.example.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.crud.entity.Employees;
import com.example.crud.service.EmployeesService;

@RestController
public class UserController {
	@Autowired
	private EmployeesService employeesService;

	@PostMapping("/addUser")
	public Employees addUser(@RequestBody Employees emp) {
		return employeesService.createUser(emp);
	}

	@GetMapping("/user/{id}")
	public Employees getUserById(@PathVariable int id) {
		return employeesService.getUserById(id);
	}

	@GetMapping("/users")
	public List<Employees> getAllEmployees() {
		return employeesService.getUsers();
	}
	
	@PutMapping("/updateuser/{id}")
	public Employees updateUser(@RequestBody Employees emp) {
		return employeesService.updateEmployee(emp);
	}

	@DeleteMapping("/deleteuser/{id}")
	public String deleteUser(@PathVariable int id) {
		System.out.print("delete");
		return employeesService.deleteUserById(id);
	}
}

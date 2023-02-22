package com.example.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crud.entity.Employees;


public interface EmployeeRepository extends JpaRepository<Employees, Integer> {

}

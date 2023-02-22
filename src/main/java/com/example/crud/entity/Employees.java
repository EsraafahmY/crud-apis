package com.example.crud.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employees {
@Id	
@GeneratedValue
private int id;
private String firstName;

private String LastName;
private String email;
private String phoneNumer;
private Date hireDate;
private Long salary;
private Long managerId;
private Long departmentId;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return LastName;
}
public void setLastName(String lastName) {
	LastName = lastName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhoneNumer() {
	return phoneNumer;
}
public void setPhoneNumer(String phoneNumer) {
	this.phoneNumer = phoneNumer;
}
public Date getHireDate() {
	return hireDate;
}
public void setHireDate(Date hireDate) {
	this.hireDate = hireDate;
}
public Long getSalary() {
	return salary;
}
public void setSalary(Long salary) {
	this.salary = salary;
}
public Long getManagerId() {
	return managerId;
}
public void setManagerId(Long managerId) {
	this.managerId = managerId;
}
public Long getDepartmentId() {
	return departmentId;
}
public void setDepartmentId(Long departmentId) {
	this.departmentId = departmentId;
}
}

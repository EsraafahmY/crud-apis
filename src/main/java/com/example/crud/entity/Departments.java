package com.example.crud.entity;

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
public class Departments {
@Id	
@GeneratedValue
private Long departmentId;
private String departmentName;
private Long managerId;
public Long getDepartmentId() {
	return departmentId;
}
public void setDepartmentId(Long departmentId) {
	this.departmentId = departmentId;
}
public String getDepartmentName() {
	return departmentName;
}
public void setDepartmentName(String departmentName) {
	this.departmentName = departmentName;
}
public Long getManagerId() {
	return managerId;
}
public void setManagerId(Long managerId) {
	this.managerId = managerId;
}




}

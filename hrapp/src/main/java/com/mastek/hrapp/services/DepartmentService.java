package com.mastek.hrapp.services;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.mastek.hrapp.apis.DepartmentAPI;
import com.mastek.hrapp.dao.DepartmentJPADAO;
import com.mastek.hrapp.dao.EmployeeJPADAO;
import com.mastek.hrapp.dao.JobPositionsDAO;
import com.mastek.hrapp.dao.ProjectJPADAO;
import com.mastek.hrapp.entities.Department;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class DepartmentService implements DepartmentAPI {
	
	@Autowired
	EmployeeJPADAO empDAO;
	
	@Autowired
	DepartmentJPADAO deptDAO;
	
	@Autowired
	ProjectJPADAO projectDAO;
	
	@Autowired
	JobPositionsDAO jobsDAO;
String exampleProperty;
	
	public DepartmentService() {
		System.out.println("Department Service Created");
	}
    
	@PostConstruct // Initialisation method of the class 
	public void initalizeService() {
		System.out.println("Department Service Initialized");
	}
	
	@PreDestroy // calls before the shutting down of the application
	public void terminateService() {
		System.out.println("Department Service Terminated");
	}
	
	public void exampleMethod() {
		System.out.println("Connect to "+ getExampleProperty()+ " for business data");
	}
	
	public String getExampleProperty() {
		return exampleProperty;
	}

	@Value("Spring Example Data Source")	// if you don't set the value the property will not be set 
	public void setExampleProperty(String exampleProperty) {
		System.out.println("Example Property Set :"+exampleProperty);
		this.exampleProperty = exampleProperty;
	}

	@Override
	public Iterable<Department> listAllDepartments() {
		System.out.println("Listing All Departments");
		return deptDAO.findAll();
	}

	@Override
	public Department findByDeptno(int deptno) {
		
		return deptDAO.findById(deptno).get();
	}

	@Override
	public Department registerNewDepartment(Department newDepartment) {
		newDepartment = deptDAO.save(newDepartment);
		return newDepartment;
	}
	
}


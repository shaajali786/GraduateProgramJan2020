package com.mastek.hrapp.services;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.mastek.hrapp.dao.DepartmentJPADAO;
import com.mastek.hrapp.dao.EmployeeJPADAO;
import com.mastek.hrapp.dao.JobPositionsDAO;
import com.mastek.hrapp.dao.ProjectJPADAO;
import com.mastek.hrapp.entities.Department;
import com.mastek.hrapp.entities.Employee;
import com.mastek.hrapp.entities.JobPositions;
import com.mastek.hrapp.entities.Project;

@Component //marking the class as a bean to be created 
@Scope("singleton") // if it is 'singleton' then it is one object used across test cases
					// if we use 'prototype' then it is one object per request

public class EmployeeService {

	String exampleProperty;
	
	//Declare all the entity DAOs to perform operation across multiple entities
	@Autowired
	EmployeeJPADAO empDAO;
	
	@Autowired
	DepartmentJPADAO deptDAO;
	
	@Autowired
	ProjectJPADAO projectDAO;
	
	@Autowired
	JobPositionsDAO jobsDAO;
	
	public EmployeeService() {
		System.out.println("Employee Service Created");
	}
    
	@PostConstruct // Initialisation method of the class 
	public void initalizeService() {
		System.out.println("Employee Service Initialized");
	}
	
	@PreDestroy // calls before the shutting down of the application
	public void terminateService() {
		System.out.println("Employee Service Terminated");
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
	@Transactional // this will keep the session open until the method returns the value
	public Employee assignEmployeeToDepartment(int empno, int deptno) {
		Employee emp = empDAO.findById(empno).get(); // fetch the employee if it exists
		Department dept = deptDAO.findById(deptno).get();//fetch the department if it exists
		
		//assign the association between employee and department
		emp.setCurrentDepartment(dept);//assign the department to employee
		dept.getTeam().add(emp);// add the employee in the department team
		
		//save the changes in the database
		empDAO.save(emp);
		deptDAO.save(dept);
		
		
		return emp; // return the result
	}
	@Transactional 
	public Employee assignEmployeeToProject(int empno, int projectId) {
		Employee emp = empDAO.findById(empno).get();// get employee object
		Project newProject = projectDAO.findById(projectId).get(); // get the project object
		
		emp.getProjectsAssigned().add(newProject); // assign employee to project 
		empDAO.save(emp); // save employee object
		
		return emp; //return the employee object
	}
	
	public JobPositions applyForJobPosition(int jobId, int empno) {
		JobPositions job = jobsDAO.findById(jobId).get();
		Employee emp = empDAO.findById(empno).get();
		
		// adding employee object in applicants collection
		job.getApplicants().add(emp);
		
		job = jobsDAO.save(job);
		return job;
	}
	
	
}

package com.mastek.hrapp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mastek.hrapp.dao.DepartmentJPADAO;
import com.mastek.hrapp.dao.EmployeeJPADAO;
import com.mastek.hrapp.dao.ProjectJPADAO;
import com.mastek.hrapp.entities.Department;
import com.mastek.hrapp.entities.Designation;
import com.mastek.hrapp.entities.Employee;
import com.mastek.hrapp.entities.Project;
import com.mastek.hrapp.services.EmployeeService;

@SpringBootTest
class HrappApplicationTests {
	
	@Autowired // spring will provide the object using IOC, dependency Injection technique
	EmployeeService empSvc;
	
	@Autowired
	EmployeeService empSvc1;
	
	
	@Autowired
	EmployeeJPADAO empDAO;
	
	@Autowired
	DepartmentJPADAO depDAO;
	
	@Autowired
	ProjectJPADAO proDAO;
	
	
	@Test
	void testeEmployeeServiceExampleMethod() {
		empSvc.exampleMethod();
		empSvc1.exampleMethod();
		
	}
	
	@Test
	void testEmployeeDAOAdd() {
		Employee emp = new Employee();
		emp.setName("New Emp");
		emp.setSalary(2334);
		emp.setDesignation(Designation.DEVELOPER);
		
		emp = empDAO.save(emp);
		
	
		System.out.println(emp);
		assertNotNull(emp, "Employee Not Added");
	}
	
	@Test
	void testListEmployees() {
		Iterable<Employee> emps = empDAO.findAll();
		assertNotNull(emps,"Employee not Found");
		for (Employee employee : emps) {
			System.out.println(employee);
		}
	}
	
	@Test
	void testDepartmentDAOadd() {
		Department dep = new Department();
		dep.setName("New Dep");
		dep.setLocation("Reading");
		
		dep = depDAO.save(dep);
		
		System.out.println(dep);
		assertNotNull(dep,"Department Not Added");
	}
	
	@Test
	void testProjectDAOadd() {
		Project pro = new Project();
		pro.setName("New Project");
		pro.setCustomerName("Home Office");
		
		pro = proDAO.save(pro);
		
		System.out.println(pro);
		assertNotNull(pro,"Project Not Added");
	}
	
	@Test
	void testUpdateEmployees() {
		Employee emp = empDAO.findById(29).get();
		System.out.println("Employee Fetched: "+emp);
		
		emp.setSalary(emp.getSalary()+1001);
		emp.setDesignation(Designation.TESTER);
		
		emp = empDAO.save(emp);
		
		System.out.println("Updated Employee:"+emp);
		
	}
	
	@Test
	void testDeleteEmployeeById() {
	//	empDAO.delete(emp); deletes by object
	//	empDAO.deleteById(53); //deletes by ID
		
	}
	@Test
	void testAssignEmployeeToDepartment() {
				// empSVC. assigning employee to department (empno, deptno)
	Employee emp = empSvc.assignEmployeeToDepartment(32,66);
	assertNotNull(emp.getCurrentDepartment(),"Department Not Assigned");
	}
	@Test
	void testAssignEmployeeToProject() {		//  empno, projectId
		Employee emp = empSvc.assignEmployeeToProject(32,16);
		assertTrue(emp.getProjectsAssigned().size()>0,"Projects assigned");
	}
}

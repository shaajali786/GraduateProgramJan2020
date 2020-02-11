package com.mastek.hrapp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mastek.hrapp.dao.DepartmentJPADAO;
import com.mastek.hrapp.dao.EmployeeJPADAO;
import com.mastek.hrapp.dao.JobPositionsDAO;
import com.mastek.hrapp.dao.PaymentJPADAO;
import com.mastek.hrapp.dao.ProjectJPADAO;
import com.mastek.hrapp.entities.CardPayment;
import com.mastek.hrapp.entities.ChequePayment;
import com.mastek.hrapp.entities.Department;
import com.mastek.hrapp.entities.Designation;
import com.mastek.hrapp.entities.Employee;
import com.mastek.hrapp.entities.JobPositions;
import com.mastek.hrapp.entities.Payment;
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
	
	@Autowired
	PaymentJPADAO paymentDAO;
	
	@Autowired
	JobPositionsDAO jobDAO;
	
	
	@Test
	void testAddJobPositionsDocument() {
		JobPositions jp = new JobPositions();
		jp.setJobId(124);
		jp.setLocation("LEEDS");
		jp.setClientName("NHS");
		jp.setSkillsRequired("Java");
		jp.setNumberOfPositions(3);
		
		jp = jobDAO.save(jp);
		
		assertNotNull(jp, "Job Position Not Saved");
	}
	
	@Test
	void testListAllJobPositions() {
		System.out.println("Print All Job Positions");
		for (JobPositions jp : jobDAO.findAll()) {
			System.out.println(jp);
		}
	}
	
	
	@Test
	void testFindEmployeesBySalary() {
		double minSalary=100.0;
		double maxSalary=5000.0;
							//empDAO.findBySalar(minSalary,maxSalary)
	Iterable<Employee> emps = empDAO.findBySalary(minSalary,maxSalary);
	
	System.out.println("All Employees having salary between min:" + minSalary+
														" and max:" +maxSalary);
	for (Employee employee : emps) {
		System.out.println(employee);
	}
	
	}
	@Test
	void testFindEmployeesByDesignation() {
		Iterable<Employee > emps = empDAO.findByDesignation(Designation.TESTER);
		
		System.out.println("All Employees with Designation as "+Designation.TESTER);
		
		for (Employee employee : emps) {
			System.out.println(employee);
		}
	}
	
	@Test
	void testCashPaymentAdd() {
		Payment cashP = new Payment();
		cashP.setAmount(100);
		
		cashP = paymentDAO.save(cashP);
		
		System.out.println(cashP);
		assertNotNull(cashP,"Cash Payment Not Saved");
		
	}
	@Test
	void testCardPaymentAdd() {
		CardPayment cardP = new CardPayment();
		cardP.setAmount(2300);
		cardP.setCardNumber(111112223333344455l);
		cardP.setCardService("VISA");
		
		cardP = paymentDAO.save(cardP);
		System.out.println(cardP);
		assertNotNull(cardP,"Card Payment not Saved");
		
	}
	@Test
	void testChequePaymentAdd() {
		ChequePayment cheqP = new ChequePayment();
		cheqP.setAmount(444);
		cheqP.setBankName("RBS");
		cheqP.setChequeNumber(22333333);
		
		cheqP = paymentDAO.save(cheqP);
		System.out.println(cheqP);
		assertNotNull(cheqP, "Cheque Payment not saved");
	}
	
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
	
	@Test
	void testApplyForJobPositions() {
		int jobId=122;
		int empno=29;
		JobPositions jp = empSvc.applyForJobPosition(jobId, empno);
		
		assertNotNull(jp,"job not applied");
		
		System.out.println("Applications for JOB ID:"+jobId);
		for (Employee applicant : jp.getApplicants()) {
			System.out.println(applicant);
		}
	}
}

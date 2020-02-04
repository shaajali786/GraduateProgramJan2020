package com.mastek.training.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.mastek.training.hrapp.Announcement;
import com.mastek.training.hrapp.Designations;
import com.mastek.training.hrapp.EmailAnnouncement;
import com.mastek.training.hrapp.EmailAnnouncement;
import com.mastek.training.hrapp.Employee;
import com.mastek.training.hrapp.Grades;
import com.mastek.training.hrapp.SMSAnnouncement;
import com.mastek.training.hrapp.SalesEmployee;
import com.mastek.training.packone.Circle;
import com.mastek.training.packone.Rectangle;
import com.mastek.training.packone.Shape;

class HRApplicationTests {
	Employee ex1;
	
	@BeforeEach
	public void setupEmpTestCases() {
	System.out.println("Before Test Case");
	//Employee.DEFAULT_ZERO;	//<Class_Name>.<static_member>
	ex1 = new Employee ();
	ex1.setEmpno(1002);
	ex1.setName("Example");
	ex1.setUnitDaySalary(300);
	ex1.setDesignation(Designations.MANAGER);
	ex1.setGrade(Grades.G8);
	
	Employee ex2= new Employee(1122);
	
	Employee ex3= new Employee(2233,"Example",344.0,Designations.DEVELOPER);
	
	ex2=null; //release the object to mark as garbage
	ex3=null;
	System.gc(); // notify system to collect garbage
	
	//ex2.getEmpno(); will throw NullPointerException
	}
	@AfterEach
	public void tearDownEmpTestCases() {
		System.out.println("After Test Case");	
		
	}

	@Test
	void testCreateAndPrintExampleEmployeeObject() {
		System.out.println("Test Case Create");
			/*Employee ex1 = new Employee ();
			ex1.setEmpno(1002);
			ex1.setName("Example");
			ex1.setUnitDaySalary(3434);
			ex1.setDesignation(Designations.MANAGER);
			ex1.setGrade(Grades.G8);*/
			
			System.out.println(
						"Number: "+ex1.getEmpno()+
						"Name: "+ex1.getName()+
						"Day Salary: "+ex1.getUnitDaySalary()+
						"Designation: "+ex1.getDesignation()+
						"Grade: "+ex1.getGrade());
						
			
				
			
	}

	@Test
	void testCreateAndComputeSalaryExampleEmployeeObject() {
		System.out.println("Test Case Compute");
		Employee ex1 = new Employee ();
		ex1.setEmpno(1002);
		ex1.setName("Example");
		ex1.setUnitDaySalary(300);
		ex1.setDesignation(Designations.MANAGER);
		ex1.setGrade(Grades.G8);
		
		try {
			assertEquals(9000.0,ex1.getNetSalary(30),"Invalid Net Salary Compuation");
			assertEquals(0,ex1.getNetSalary(-30),"Invalid Net Salary Compuation");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	void testSalesEmployeeObjectUsage() {
		SalesEmployee saleEx1 = new SalesEmployee();
		saleEx1.setEmpno(224);
		saleEx1.setName("Example");
		saleEx1.setUnitDaySalary(100);
		saleEx1.setDesignation(Designations.OFFICE);
		saleEx1.setGrade(Grades.G8);
		saleEx1.setCommission(0.8);
		saleEx1.setTarget(1000000000);
		
		try {
			assertEquals(1620,saleEx1.getNetSalary(9),"invalid Salary Calculated");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	void testObjectFeaturesOnEmployee() {
		System.out.println("<===== Object Features Start ========>");
		System.out.println(ex1.toString());
		System.out.println("HashCode:"+ex1.hashCode());
		System.out.println("<=========Object Features End=========>");
	}
	
	void testSendAnnouncementToEmployees() {
		// we cannot create an object of abstract class using the 'new' keyword
		//Announcement exAnnouncement = new Announcement();
		
		// to use an abstract class object you must extend it with the derived class
		// and override ALL abstract methods defined in base/parent class
		Announcement exSMS = new SMSAnnouncement();
		exSMS.setFrom("UK-HR");
		exSMS.setForGroup("MASTEKEER_AT_GLASGOW");
		exSMS.setSubject("Inclement Weather Conditions at Glasgow");
		exSMS.setContentText("All Employees are advised to opt for work from Home, tomorrow");
		
		Announcement exEmail= new EmailAnnouncement();
		exEmail.setFrom("Leadership Team");
		exEmail.setForGroup("Mastekeers");
		exEmail.setSubject("QMEET JAN 2020");
		exEmail.setContentText("You are all invited to attend Quarterly meet online via WEBEX");
		
		if (exSMS instanceof SMSAnnouncement) {
			System.out.println("Connect to Telecom SMS Service");
			exSMS.sendAnnouncement(); // connect to SMS and use send from SMSAnnouncement
		}
		if (exEmail instanceof EmailAnnouncement) {
			System.out.println("Connect to Email Service");
			exSMS.sendAnnouncement(); // connect to SMS and use send from SMSAnnouncement
		}
		exSMS.sendAnnouncement(); // connect to SMS and use send from SMSAnnouncement
		exEmail.sendAnnouncement(); // connect to Email and use send from SMSAnnouncement
		
		assertTrue(exSMS instanceof SMSAnnouncement);
		assertTrue(exEmail instanceof EmailAnnouncement, "Invalid Announement Implementation");
	}
		
		
	@Test
	void testShapeExample() {
		Rectangle rect = new Rectangle ();
		rect.setLength(10);
		rect.setBreadth(20);
		
		Circle circle = new Circle ();
		circle.setRadius(20);
		
		Shape shRect = rect;
		Shape shCircle = circle;
		
		System.out.println("Rectangle Area: "+shRect.getArea());
		System.out.println("Rectange Area: "+shRect.getPerimeter());
		
		System.out.println("Circle Area: "+ shCircle.getArea());
		System.out.println("Cirlce Area: "+ shCircle.getPerimeter());
		
		assertTrue (rect instanceof Shape, "Invalid Type of Shape");
		assertTrue(circle instanceof Shape, "Invalid Type of Shape");
	}

	
}


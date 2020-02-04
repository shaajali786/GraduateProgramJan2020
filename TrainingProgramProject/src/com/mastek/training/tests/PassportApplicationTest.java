package com.mastek.training.tests;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.mastek.training.basics.passport.DataAccessObjectP;
import com.mastek.training.basics.passport.PassportApplication;
import com.mastek.training.basics.passport.PassportApplicationDAO;
import com.mastek.training.basics.passport.Sex;

class PassportApplicationTest {
	DataAccessObjectP<PassportApplication> passDAO;
	
	
	@BeforeEach
	void setUp() throws Exception {
		passDAO = new PassportApplicationDAO();
	}

	@AfterEach
	void tearDown() throws Exception {
		
	}

	@Test
	void testDisplayPassportDetails() {
	System.out.println("Passport Application Create");
	PassportApplication newPass = new PassportApplication();
	newPass.setPassport_id(2);
	newPass.setFirst_name("Shaj");
	newPass.setSurname("G");
	newPass.setDate_of_birth("05/03/1996");
	newPass.setNationality("British");
	newPass.setPlace_of_birth("Bradford");
	newPass.setSex(Sex.Male);
	
	System.out.println(
			"Passport id: "+newPass.getPassport_id()+
			"\n first name: "+newPass.getFirst_name()+
			"\n surname: "+newPass.getSurname()+
			"\n date of birth: "+newPass.getDate_of_birth()+
			"\n nationality: "+newPass.getNationality()+
			"\n place of birth: "+newPass.getPlace_of_birth()+
			"\n sex: "+newPass.getSex());
			
	newPass = passDAO.add(newPass); //returns the object if saved successfully
	assertNotNull(newPass, "Passport details not added");

	PassportApplication fetchPass = passDAO.find(2);
	 assertNotNull(fetchPass, "Details not found");
		
			
	
	 System.out.println("Details Added");
	
	}
	@Test
	void testRemovePassportApplication() {
	    PassportApplication newPass = new PassportApplication();
	    newPass.setPassport_id(1443);
	    newPass.setFirst_name("Example");
	    newPass.setSurname("Example");
	    newPass.setDate_of_birth;("17/08/1995");
	    newPass.setNationality("British");
	    newPass.setPlace_of_birth("Germany");
	    newPass.setSex(Sex.Female);
	    
	    newPass = passDAO.add(newPass); 
	    assertNotNull(newPass, "Passport Application not added");
	    
	    PassportApplication removedPass = passDAO.remove(1443);
	    assertNotNull(removedPass, "Passport Application Not Removed");
	    
	    PassportApplication checkRemovedPass = passDAO.find(1443);
	    assertNull(checkRemovedPass, "Passport Application Not Removed");
	    
	}
}

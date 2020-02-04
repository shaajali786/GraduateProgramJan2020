package com.mastek.training.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.mastek.training.LinkedIn.Profile;
import com.mastek.training.hrapp.Employee;

class LinkedInTests {

	
	@Test
	void testCreateProfileAndView() {
		Profile li1 = new Profile ();
		li1.setEmail("Test@mastek.com");
		li1.setProName("Test");
		li1.setQuals("JAVA");
		li1.setSkills ("Teamwork");
		li1.setCerts("GDPR");
		li1.setJobDetails ("Mastek");

		
		System.out.println(
	
				"email: "+li1.getEmail()+
				"\nName: "+li1.getProName()+
				"\nQualifications: "+li1.getQuals()+
				"\nSkills: "+li1.getSkills()+
				"\nCertifications: "+li1.getCerts()+
				"\nJob Details: "+li1.getJobDetails());
			
		
	}





}
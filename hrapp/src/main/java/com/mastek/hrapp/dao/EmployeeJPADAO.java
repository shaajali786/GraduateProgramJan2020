package com.mastek.hrapp.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mastek.hrapp.entities.Designation;
import com.mastek.hrapp.entities.Employee;

@Repository //Declare the DAO layer as repository to manage data operations 
public interface EmployeeJPADAO extends
				CrudRepository<Employee, Integer>{		//Crud repository <class,PrimaryKeyType

	// define the methods for each named query in the entity
	Iterable<Employee> findBySalary
			(@Param("minSalary")double minSalary, 	// map each parameter with @Param(<name>)
			 @Param("maxSalary")double maxSalary);  
	
	
	Iterable<Employee> findByDesignation(@Param("designation")Designation designation);
	
}

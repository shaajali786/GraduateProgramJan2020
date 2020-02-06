package com.mastek.hrapp.dao;

import org.springframework.data.repository.CrudRepository;

import com.mastek.hrapp.entities.Project;

public interface ProjectJPADAO extends
				 CrudRepository<Project, Integer>{

}

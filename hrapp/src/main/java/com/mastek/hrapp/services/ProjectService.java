package com.mastek.hrapp.services;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;

@Component
@Scope("singleton")
public class ProjectService {
	
String exampleProperty;
	
	public ProjectService() {
		System.out.println("Project Service Created");
	}
    
	@PostConstruct // Initialisation method of the class   
	public void initalizeService() {
		System.out.println("Project Service Initialized");
	}
	
	@PreDestroy // calls before the shutting down of the application
	public void terminateService() {
		System.out.println("Project Service Terminated");
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
	
}


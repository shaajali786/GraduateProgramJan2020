package com.mastek.hrapp.apis;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.mastek.hrapp.services.DepartmentService;
import com.mastek.hrapp.services.EmployeeService;
import com.mastek.hrapp.services.ProjectService;

@Component // declare it as spring component 
public class APIConfig 
			extends ResourceConfig{
		// configure the service classes using resourceConfig
	
	public APIConfig() {
		// register each service class to enable service as PI
		register(EmployeeService.class);
	
		register(DepartmentService.class);
		
		register(ProjectService.class);
		
		register(CORSFilter.class);
		// this will enable the CORS filter for UI applications to access the service  (to be used with API)
		
	}
	
	
}

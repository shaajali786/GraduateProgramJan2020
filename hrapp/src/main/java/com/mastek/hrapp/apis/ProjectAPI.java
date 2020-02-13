package com.mastek.hrapp.apis;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mastek.hrapp.entities.Project;
@Path("/hrapp/")	//Url pattern to access the current API interface
public interface ProjectAPI {
	
	

		// http://localhost:7777/hrapp/project/list
		@GET	// this is to let us know we do support the Http method:GET
		@Path("/project/list") 	// this is the URL path to access this method
		@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})	// these are the formats which the methods support
		public Iterable<Project> listAllProjects();
		
		@GET	//http method
		@Path("/project/find/{proId}")	// url with parameter format
		@Produces({MediaType.APPLICATION_JSON})
		public Project findByproId(@PathParam("proId")int proid);
		
		@POST // http method allows you to send data in requests
		@Path("/project/register")
		@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
		@Produces(MediaType.APPLICATION_JSON)
		public Project registerNewProject(@BeanParam Project newProject);
	

}

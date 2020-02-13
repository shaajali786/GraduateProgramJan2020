package com.mastek.hrapp.apis;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mastek.hrapp.entities.Department;

@Path("/hrapp/")
public interface DepartmentAPI {

	@GET
	@Path("/department/list")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Iterable<Department> listAllDepartments();
	
	@GET
	@Path("/department/find/{deptno}")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Department findByDeptno(@PathParam("deptno")int deptno);
	
	@POST
	@Path("department/register")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.APPLICATION_JSON)
	public Department registerNewDepartment(@BeanParam Department newDepartment);
	
	
}

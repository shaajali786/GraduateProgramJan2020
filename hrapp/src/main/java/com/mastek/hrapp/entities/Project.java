package com.mastek.hrapp.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.ws.rs.FormParam;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@Table(name="JPA_Projects")
public class Project {
	
		int proId;
		@FormParam("name")
		String name;
		
		@FormParam("customerName")
		String customerName;
	
		Set<Employee> projectTeam = new HashSet<>();
	
		@ManyToMany(mappedBy="projectsAssigned")// provide the property in employee with @ManyToMany
		@XmlTransient// this ignore the association property when shared via service
		public Set<Employee> getProjectTeam() {
			return projectTeam;
		}

		public void setProjectTeam(Set<Employee> projectTeam) {
			this.projectTeam = projectTeam;
		}

		public Project() {
			
		}
		
		@Id
		@Column(name= "project_number")
		@GeneratedValue(strategy=GenerationType.AUTO)
		public int getProjectId() {
			return proId;
		}
		public void setProjectId(int projectId) {
			this.proId = projectId;
		}
		@Column(name="name", length=50,nullable=false)
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		@Column (name="customer_name", length=50, nullable=false)
		public String getCustomerName() {
			return customerName;
		}
		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}
		@Override
		public String toString() {
			return "Project [projectId=" + proId + ", name=" + name + ", customerName=" + customerName + "]";
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + proId;
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Project other = (Project) obj;
			if (proId != other.proId)
				return false;
			return true;
		}
		
		
		
}

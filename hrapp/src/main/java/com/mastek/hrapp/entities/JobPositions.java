package com.mastek.hrapp.entities;



import java.util.HashSet;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document (collection= "JPA_INTERNAL_JOB_POSITIONS") // this specifies what class and structure is required 
public class JobPositions {

		int jobId;
		String clientName;
		int numberOfPositions;
		String skillsRequired;
		String location;
		
		Set<Employee> applicants = new HashSet<>();
		
		
		
		public Set<Employee> getApplicants() {
			return applicants;
		}
		public void setApplicants(Set<Employee> applicants) {
			this.applicants = applicants;
		}
		public JobPositions() {
			
		}
		@Id
		public int getJobId() {
			return jobId;
		}

		public void setJobId(int jobId) {
			this.jobId = jobId;
		}

		public String getClientName() {
			return clientName;
		}

		public void setClientName(String clientName) {
			this.clientName = clientName;
		}

		public int getNumberOfPositions() {
			return numberOfPositions;
		}

		public void setNumberOfPositions(int numberOfPositions) {
			this.numberOfPositions = numberOfPositions;
		}

		public String getSkillsRequired() {
			return skillsRequired;
		}

		public void setSkillsRequired(String skillsRequired) {
			this.skillsRequired = skillsRequired;
		}

		public String getLocation() {
			return location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + jobId;
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
			JobPositions other = (JobPositions) obj;
			if (jobId != other.jobId)
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "JobPositions [jobId=" + jobId + ", clientName=" + clientName + ", numberOfPositions="
					+ numberOfPositions + ", skillsRequired=" + skillsRequired + ", location=" + location + "]";
		}
		
}

package com.medenrollment.test.dto;

import java.util.List;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;

import com.medenrollment.test.model.Dependent;

public class EnrolleeTo {
	
	@Id
	private int enrolleeId;
	@NotNull
	@NotEmpty(message="Enrollee Name is Mandatory")
	@Size(min=8,max=30)
	private String enrolleeName;
	
	@NotNull
	@NotEmpty(message="Enrollee activationStatus is Mandatory")
	@Size(min=8,max=30)
	private boolean activationStatus;
	@NotNull
	@NotEmpty(message="Enrollee date of birth is Mandatory")
	private String dateOfBirth;
	private String phoneNo;
	private List<Dependent> dependents;
	
	public EnrolleeTo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EnrolleeTo(int enrolleeId,
			@NotNull @NotEmpty(message = "Enrollee Name is Mandatory") @Size(min = 8, max = 30) String enrolleeName,
			@NotNull @NotEmpty(message = "Enrollee activationStatus is Mandatory") @Size(min = 8, max = 30) boolean activationStatus,
			@NotNull @NotEmpty(message = "Enrollee date of birth is Mandatory") @Size(min = 8, max = 30) String dateOfBirth,
			String phoneNo, List<Dependent> dependents) {
		super();
		this.enrolleeId = enrolleeId;
		this.enrolleeName = enrolleeName;
		this.activationStatus = activationStatus;
		this.dateOfBirth = dateOfBirth;
		this.phoneNo = phoneNo;
		this.dependents = dependents;
	}

	public int getEnrolleeId() {
		return enrolleeId;
	}

	public void setEnrolleeId(int enrolleeId) {
		this.enrolleeId = enrolleeId;
	}

	public String getEnrolleeName() {
		return enrolleeName;
	}

	public void setEnrolleeName(String enrolleeName) {
		this.enrolleeName = enrolleeName;
	}

	public boolean isActivationStatus() {
		return activationStatus;
	}

	public void setActivationStatus(boolean activationStatus) {
		this.activationStatus = activationStatus;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public List<Dependent> getDependents() {
		return dependents;
	}

	public void setDependents(List<Dependent> dependents) {
		this.dependents = dependents;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (activationStatus ? 1231 : 1237);
		result = prime * result + ((dateOfBirth == null) ? 0 : dateOfBirth.hashCode());
		result = prime * result + ((dependents == null) ? 0 : dependents.hashCode());
		result = prime * result + enrolleeId;
		result = prime * result + ((enrolleeName == null) ? 0 : enrolleeName.hashCode());
		result = prime * result + ((phoneNo == null) ? 0 : phoneNo.hashCode());
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
		EnrolleeTo other = (EnrolleeTo) obj;
		if (activationStatus != other.activationStatus)
			return false;
		if (dateOfBirth == null) {
			if (other.dateOfBirth != null)
				return false;
		} else if (!dateOfBirth.equals(other.dateOfBirth))
			return false;
		if (dependents == null) {
			if (other.dependents != null)
				return false;
		} else if (!dependents.equals(other.dependents))
			return false;
		if (enrolleeId != other.enrolleeId)
			return false;
		if (enrolleeName == null) {
			if (other.enrolleeName != null)
				return false;
		} else if (!enrolleeName.equals(other.enrolleeName))
			return false;
		if (phoneNo == null) {
			if (other.phoneNo != null)
				return false;
		} else if (!phoneNo.equals(other.phoneNo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "EnrolleeTo [enrolleeId=" + enrolleeId + ", enrolleeName=" + enrolleeName + ", activationStatus="
				+ activationStatus + ", dateOfBirth=" + dateOfBirth + ", phoneNo=" + phoneNo + ", dependents="
				+ dependents + "]";
	}
	
	
	
	

}

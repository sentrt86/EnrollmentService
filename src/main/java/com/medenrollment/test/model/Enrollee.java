/**
 * 
 */
package com.medenrollment.test.model;

import java.io.Serializable;
import java.util.List;

/**
 * @author Senthil Kumar
 *
 */
public class Enrollee implements Serializable {
	



	private static final long serialVersionUID = 3614060108697913945L;

	
	private int enrolleeId;
	private String enrolleeName;
	private boolean activationStatus;
	private String dateOfBirth;
	private String phoneNo;
	private List<Dependent> dependents;
	
	

	public Enrollee(int enrolleeId, String enrolleeName, boolean activationStatus, String dateOfBirth, String phoneNo,
			List<Dependent> dependents) {
		super();
		this.enrolleeId = enrolleeId;
		this.enrolleeName = enrolleeName;
		this.activationStatus = activationStatus;
		this.dateOfBirth = dateOfBirth;
		this.setPhoneNo(phoneNo);
		this.setDependents(dependents);
	}

	public Enrollee() {
		// TODO Auto-generated constructor stub
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
		Enrollee other = (Enrollee) obj;
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
		return "Enrollee [enrolleeId=" + enrolleeId + ", enrolleeName=" + enrolleeName + ", activationStatus="
				+ activationStatus + ", dateOfBirth=" + dateOfBirth + ", phoneNo=" + phoneNo + ", dependents="
				+ dependents + "]";
	}
	

}

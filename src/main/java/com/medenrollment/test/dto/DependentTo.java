package com.medenrollment.test.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;

public class DependentTo {
	
	@Id
	public int dependentId;
	
	@NotNull
	@NotEmpty(message="must have dependent name")
	@Size(min=8,max=30)
	public String dependentName;
	
	@NotNull
	@NotEmpty(message="must have dependent date of brith")
	public String dependentDob;
	public String relationship;
	
	public DependentTo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DependentTo(int dependentId,
			@NotNull @NotEmpty(message = "must have dependent name") @Size(min = 8, max = 30) String dependentName,
			@NotNull @NotEmpty(message = "must have dependent date of brith") String dependentDob,
			String relationship) {
		super();
		this.dependentId = dependentId;
		this.dependentName = dependentName;
		this.dependentDob = dependentDob;
		this.relationship = relationship;
	}

	public int getDependentId() {
		return dependentId;
	}

	public void setDependentId(int dependentId) {
		this.dependentId = dependentId;
	}

	public String getDependentName() {
		return dependentName;
	}

	public void setDependentName(String dependentName) {
		this.dependentName = dependentName;
	}

	public String getDependentDob() {
		return dependentDob;
	}

	public void setDependentDob(String dependentDob) {
		this.dependentDob = dependentDob;
	}

	public String getRelationship() {
		return relationship;
	}

	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dependentDob == null) ? 0 : dependentDob.hashCode());
		result = prime * result + dependentId;
		result = prime * result + ((dependentName == null) ? 0 : dependentName.hashCode());
		result = prime * result + ((relationship == null) ? 0 : relationship.hashCode());
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
		DependentTo other = (DependentTo) obj;
		if (dependentDob == null) {
			if (other.dependentDob != null)
				return false;
		} else if (!dependentDob.equals(other.dependentDob))
			return false;
		if (dependentId != other.dependentId)
			return false;
		if (dependentName == null) {
			if (other.dependentName != null)
				return false;
		} else if (!dependentName.equals(other.dependentName))
			return false;
		if (relationship == null) {
			if (other.relationship != null)
				return false;
		} else if (!relationship.equals(other.relationship))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "DependentTo [dependentId=" + dependentId + ", dependentName=" + dependentName + ", dependentDob="
				+ dependentDob + ", relationship=" + relationship + "]";
	}
	
	

}

package com.medenrollment.test.dao;

import java.util.List;

import com.medenrollment.test.model.Dependent;
import com.medenrollment.test.model.Enrollee;

public interface IEnrollementDAO {
	
	public List<Enrollee> getallEnrollees();
	public boolean addEnrollee(Enrollee enrollee);
	public boolean updateEnrollee(Enrollee enrollee);
	public boolean deleteEnrollee(int enrolleeId);
	public List<Dependent> getallDependents(int enrolleeId);
	public boolean addDependent(int enrolleeId, Dependent dependent);
	public boolean updateDependent(int enrolleeId, Dependent dependent);
	public boolean deleteDependent(int enrolleeId, int dependentId);

}

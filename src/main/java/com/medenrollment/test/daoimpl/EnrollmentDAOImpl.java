package com.medenrollment.test.daoimpl;

import java.sql.Types;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.medenrollment.test.dao.IEnrollementDAO;
import com.medenrollment.test.mapper.DependentMapper;
import com.medenrollment.test.mapper.EnrolleeMapper;
import com.medenrollment.test.model.Dependent;
import com.medenrollment.test.model.Enrollee;
import com.medenrollment.test.sql.EnrollmentSystemSQLS;

public class EnrollmentDAOImpl implements IEnrollementDAO {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@SuppressWarnings({ "unchecked", "deprecation" })
	@Override
	public List<Enrollee> getallEnrollees() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query(EnrollmentSystemSQLS.getAllEnrollees,new Object[]{},new EnrolleeMapper());
	}

	@Override
	public boolean addEnrollee(Enrollee enrollee) {
		boolean enrolleeAdded = false;
		Object[] parms = new Object[] {enrollee.getEnrolleeId(),enrollee.getEnrolleeName(),enrollee.isActivationStatus(),enrollee.getDateOfBirth(),enrollee.getPhoneNo(),enrollee.getDependents()};
		int[] parmsType = new int[] {Types.INTEGER,Types.CHAR,Types.BOOLEAN,Types.CHAR,Types.CHAR,Types.ARRAY};
		int createCount = jdbcTemplate.update(EnrollmentSystemSQLS.addEnrollee,parms,parmsType);
		if (createCount > 0)
		{
			enrolleeAdded = true;
		}
		return enrolleeAdded;
	}

	@Override
	public boolean updateEnrollee(Enrollee enrollee) {
		boolean enrolleeUpdated = false;
		
		Object[] parms = new Object[] {enrollee.getEnrolleeName(),enrollee.isActivationStatus(),enrollee.getDateOfBirth(),enrollee.getPhoneNo(),enrollee.getDependents(),enrollee.getEnrolleeId()};
		int[] parmsTypes = new int[] {Types.CHAR,Types.BOOLEAN,Types.CHAR,Types.CHAR,Types.ARRAY,Types.INTEGER};
		int updateCount = jdbcTemplate.update(EnrollmentSystemSQLS.updateEnrollee,parms,parmsTypes);		
		if (updateCount > 0)
		{
			enrolleeUpdated = true;
		}
		return enrolleeUpdated;
	}

	@Override
	public boolean deleteEnrollee(int enrolleeId) {
		boolean enrolleeDeleted = false;
		
		Object[] parms = new Object[] {enrolleeId};
		int[] parmsTypes = new int[] {Types.INTEGER};
		int deleteCount = jdbcTemplate.update(EnrollmentSystemSQLS.deleteEnrollee,parms,parmsTypes);		
		if (deleteCount > 0)
		{
			enrolleeDeleted = true;
		}
		return enrolleeDeleted;
	}

	@SuppressWarnings({ "deprecation", "unchecked" })
	@Override
	public List<Dependent> getallDependents(int enrolleeId) {
		// TODO Auto-generated method stub
		return jdbcTemplate.query(EnrollmentSystemSQLS.getAllDependents, new Object[]{},new DependentMapper());
	}

	@Override
	public boolean addDependent(int enrolleeId, Dependent dependent) {
		boolean dependentAdded = false;
		Object[] parms = new Object[] {dependent.getDependentId(),dependent.getDependentName(),dependent.getDependentDob(),dependent.getRelationship(),enrolleeId};
		int[] parmsType = new int[] {Types.INTEGER,Types.CHAR,Types.CHAR,Types.CHAR,Types.INTEGER};
		int createCount = jdbcTemplate.update(EnrollmentSystemSQLS.addDependent,parms,parmsType);
		if (createCount > 0)
		{
			dependentAdded = true;
		}
		return dependentAdded;
	}

	@Override
	public boolean updateDependent(int enrolleeId, Dependent dependent) {
		boolean dependentUpdated = false;
		Object[] parms = new Object[] {dependent.getDependentName(),dependent.getDependentDob(),dependent.getRelationship(),enrolleeId,dependent.getDependentId()};
		int[] parmsType = new int[] {Types.CHAR,Types.CHAR,Types.CHAR,Types.INTEGER,Types.INTEGER};
		int updatecount = jdbcTemplate.update(EnrollmentSystemSQLS.updateDependent,parms,parmsType);
		if (updatecount > 0)
		{
			dependentUpdated = true;
		}
		return dependentUpdated;
	}

	@Override
	public boolean deleteDependent(int enrolleeId, int dependentId) {
		boolean dependentDeleted = false;
		
		Object[] parms = new Object[] {enrolleeId,dependentId};
		int[] parmsTypes = new int[] {Types.INTEGER,Types.INTEGER};
		int deletecount = jdbcTemplate.update(EnrollmentSystemSQLS.deleteDependent,parms,parmsTypes);		
		if (deletecount > 0)
		{
			dependentDeleted = true;
		}
		return dependentDeleted;	}

}

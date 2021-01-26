package com.medenrollment.test.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;


import com.medenrollment.test.constant.EnrollmentConstants;
import com.medenrollment.test.daoimpl.EnrollmentDAOImpl;
import com.medenrollment.test.dto.DependentTo;
import com.medenrollment.test.dto.EnrolleeTo;
import com.medenrollment.test.exception.ResourceDuplicateException;
import com.medenrollment.test.exception.ResourceNotCreatedException;
import com.medenrollment.test.exception.ResourceNotDeletedException;
import com.medenrollment.test.exception.ResourceNotUpdatedException;
import com.medenrollment.test.model.Dependent;
import com.medenrollment.test.model.Enrollee;

@Service
public class EnrollmentServiceImpl implements IEnrollementService {
	
	@Autowired
	EnrollmentDAOImpl enrollmentDAOImpl;
	
	
	public List<Enrollee> getAllEnrollees(){
		return enrollmentDAOImpl.getallEnrollees();
		
	}
	
	public List<Dependent> getAllDependents(int enrolleeId){
		return enrollmentDAOImpl.getallDependents(enrolleeId);
		
	}
	

	@Override
	public String addEnrollee(EnrolleeTo enrolleeTo) throws ResourceDuplicateException, ResourceNotCreatedException {
		List<Enrollee> allEnrollees = new ArrayList<Enrollee>();
		try {
			allEnrollees = getAllEnrollees();
			if(!allEnrollees.isEmpty()) {
				for (Enrollee enrollee : allEnrollees) {
					if(enrollee.getEnrolleeName().equalsIgnoreCase(enrolleeTo.getEnrolleeName())) {
						throw new ResourceDuplicateException(String.format(EnrollmentConstants.duplicateFound));
					}
					
				}
				
			}
			if(enrollmentDAOImpl.addEnrollee(new Enrollee(enrolleeTo.getEnrolleeId(),enrolleeTo.getEnrolleeName(),enrolleeTo.isActivationStatus(),enrolleeTo.getDateOfBirth(),enrolleeTo.getPhoneNo(),enrolleeTo.getDependents()))) {
				return String.format(EnrollmentConstants.createSuccessfull);
			}
		
		}catch(DataAccessException ex) { 
			throw new ResourceNotCreatedException(String.format(EnrollmentConstants.databaseAccessIssue)); 
		} 
		return String.format(EnrollmentConstants.createUnSuccessfull);
		
		
	}

	@Override
	public String updateEnrollee(EnrolleeTo enrolleeTo) throws Exception {
		try {
			boolean updateSuccess =enrollmentDAOImpl.updateEnrollee(new Enrollee(enrolleeTo.getEnrolleeId(),enrolleeTo.getEnrolleeName(),enrolleeTo.isActivationStatus(),enrolleeTo.getDateOfBirth(),enrolleeTo.getPhoneNo(),enrolleeTo.getDependents()));
			if(updateSuccess) {
				return String.format(EnrollmentConstants.updateSuccessfull);
			}
		}
		catch(DataAccessException ex) {
			throw new ResourceNotUpdatedException(String.format(EnrollmentConstants.updateUnSuccessfull));
			
		}
		return String.format(EnrollmentConstants.updateUnSuccessfull);
	}

	@Override
	public String deleteEnrollee(int enrolleeId) throws ResourceNotDeletedException {
		try {
			boolean deleteSuccess =enrollmentDAOImpl.deleteEnrollee(enrolleeId);
			if(deleteSuccess) {
				return String.format(EnrollmentConstants.deleteSuccessfull);
			}
		}
		catch(DataAccessException ex) {
			throw new ResourceNotDeletedException(String.format(EnrollmentConstants.deleteUnSuccessfull));
			
		}
		return String.format(EnrollmentConstants.deleteSuccessfull);
	}

	
	@Override
	public String addDependent(int enrolleeId, DependentTo dependentTo) throws ResourceDuplicateException, ResourceNotCreatedException {
		List<Dependent> alldependents = new ArrayList<Dependent>();
		try {
			alldependents = getAllDependents(enrolleeId);
			if(!alldependents.isEmpty()) {
				for (Dependent dependent : alldependents) {
					if(dependent.getDependentName().equalsIgnoreCase(dependentTo.getDependentName())) {
						throw new ResourceDuplicateException(String.format(EnrollmentConstants.duplicateFound));
					}
					
				}
				
			}
			if(enrollmentDAOImpl.addDependent(enrolleeId,new Dependent(dependentTo.getDependentId(),dependentTo.getDependentName(),dependentTo.getDependentDob(),dependentTo.getRelationship()))) {
				return String.format(EnrollmentConstants.createSuccessfull);
			}
		
		}catch(DataAccessException ex) { 
			throw new ResourceNotCreatedException(String.format(EnrollmentConstants.databaseAccessIssue)); 
		} 
		return String.format(EnrollmentConstants.createUnSuccessfull);
	}

	@Override
	public String updateDependent(int enrolleeId, DependentTo dependentTo) throws ResourceNotUpdatedException {
		try {
			boolean updateSuccess =enrollmentDAOImpl.updateDependent(enrolleeId, new Dependent(dependentTo.getDependentId(),dependentTo.getDependentName(),dependentTo.getDependentDob(),dependentTo.getRelationship()));
			if(updateSuccess) {
				return String.format(EnrollmentConstants.updateSuccessfull);
			}
		}
		catch(DataAccessException ex) {
			throw new ResourceNotUpdatedException(String.format(EnrollmentConstants.updateUnSuccessfull));
			
		}
		return String.format(EnrollmentConstants.updateUnSuccessfull);
	}

	@Override
	public String deleteDependent(int enrolleeId, int dependentId) throws ResourceNotDeletedException {
		try {
			boolean deleteSuccess =enrollmentDAOImpl.deleteDependent(enrolleeId, dependentId);
			if(deleteSuccess) {
				return String.format(EnrollmentConstants.deleteSuccessfull);
			}
		}
		catch(DataAccessException ex) {
			throw new ResourceNotDeletedException(String.format(EnrollmentConstants.deleteUnSuccessfull));
			
		}
		return String.format(EnrollmentConstants.deleteUnSuccessfull);

	}

}

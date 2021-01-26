package com.medenrollment.test.service;

import org.springframework.stereotype.Service;

import com.medenrollment.test.dto.DependentTo;
import com.medenrollment.test.dto.EnrolleeTo;
import com.medenrollment.test.exception.ResourceDuplicateException;
import com.medenrollment.test.exception.ResourceNotCreatedException;
import com.medenrollment.test.exception.ResourceNotDeletedException;

@Service
public interface IEnrollementService {
	
	public String addEnrollee(EnrolleeTo enrolleeTo) throws Exception;
	public String updateEnrollee(EnrolleeTo enrolleeTo) throws Exception;
	public String deleteEnrollee(int enrolleeId) throws Exception;
	public String addDependent(int enrolleeId, DependentTo dependentTo) throws Exception;
	public String updateDependent(int enrolleeId, DependentTo dependentTo) throws Exception;
	public String deleteDependent(int enrolleeId, int dependentId) throws Exception;
	
	

}

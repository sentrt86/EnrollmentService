package com.medenrollment.test.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.medenrollment.test.dto.DependentTo;
import com.medenrollment.test.dto.EnrolleeTo;
import com.medenrollment.test.exception.ResourceDuplicateException;
import com.medenrollment.test.exception.ResourceNotCreatedException;
import com.medenrollment.test.exception.ResourceNotDeletedException;
import com.medenrollment.test.exception.ResourceNotUpdatedException;
import com.medenrollment.test.service.EnrollmentServiceImpl;


@RestController
@RequestMapping("/api")
public class EnrollmentController {
	
	@Autowired
	EnrollmentServiceImpl enrollmentService;

	@RequestMapping(value="/addenrollee",method=RequestMethod.POST)
	public ResponseEntity<String> addEnrollee(@RequestBody @Valid EnrolleeTo enrolleeTo) throws ResourceDuplicateException, ResourceNotCreatedException{
		return new ResponseEntity<String>(enrollmentService.addEnrollee(enrolleeTo),HttpStatus.OK);
	}
	
	@RequestMapping(value="/updateenrollee",method=RequestMethod.POST)
	public ResponseEntity<String> updateEnrollee(@RequestBody @Valid EnrolleeTo enrolleeTo) throws Exception{
		return new ResponseEntity<String>(enrollmentService.updateEnrollee(enrolleeTo),HttpStatus.OK);
	}
	
	@RequestMapping(value="/deleteenrollee",method=RequestMethod.POST)
	public ResponseEntity<String> deleteEnrollee(@RequestBody @Valid int enrolleeId) throws ResourceNotDeletedException{
		return new ResponseEntity<String>(enrollmentService.deleteEnrollee(enrolleeId),HttpStatus.OK);
	}

	@RequestMapping(value="/createdependent",method=RequestMethod.POST)
	public ResponseEntity<String> addEnrollee(@RequestBody @Valid int enrolleeId, DependentTo dependentTo) throws ResourceDuplicateException, ResourceNotCreatedException{
		return new ResponseEntity<String>(enrollmentService.addDependent(enrolleeId,dependentTo),HttpStatus.OK);
	}
	
	@RequestMapping(value="/updatedependent",method=RequestMethod.POST)
	public ResponseEntity<String> updateEnrollee(@RequestBody @Valid int enrolleeId, DependentTo dependentTo) throws ResourceNotUpdatedException{
		return new ResponseEntity<String>(enrollmentService.updateDependent(enrolleeId,dependentTo),HttpStatus.OK);
	}
	
	@RequestMapping(value="/deletedependent",method=RequestMethod.POST)
	public ResponseEntity<String> deleteEnrollee(@RequestBody @Valid int enrolleeId,int dependentId) throws ResourceNotDeletedException{
		return new ResponseEntity<String>(enrollmentService.deleteDependent(enrolleeId,dependentId),HttpStatus.OK);
	}
}

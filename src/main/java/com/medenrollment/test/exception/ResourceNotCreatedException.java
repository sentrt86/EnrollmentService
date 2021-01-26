package com.medenrollment.test.exception;

public class ResourceNotCreatedException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2444906700932844298L;

	public ResourceNotCreatedException() {
		super();
	}


	public ResourceNotCreatedException(String message, Throwable cause, boolean
			enableSuppression, boolean writableStackTrace) { 
		super(message, cause,enableSuppression, writableStackTrace); 
	}

	public ResourceNotCreatedException(String message, Throwable cause) {
		super(message, cause);
	}

	public ResourceNotCreatedException(String message) { 
		super(message); 
	}

	public ResourceNotCreatedException(Throwable cause) { 
		super(cause);
	}
}

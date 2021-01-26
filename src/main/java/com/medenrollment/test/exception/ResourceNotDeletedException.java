package com.medenrollment.test.exception;

public class ResourceNotDeletedException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5525638379510113888L;
	
	public ResourceNotDeletedException(String message, Throwable cause, boolean
			enableSuppression, boolean writableStackTrace) { 
		super(message, cause,enableSuppression, writableStackTrace); 
	}

	public ResourceNotDeletedException(String message, Throwable cause) {
		super(message, cause);
	}

	public ResourceNotDeletedException(String message) { 
		super(message); 
	}

	public ResourceNotDeletedException(Throwable cause) { 
		super(cause);
	}

}

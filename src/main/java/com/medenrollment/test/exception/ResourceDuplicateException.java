package com.medenrollment.test.exception;

public class ResourceDuplicateException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7865679963258849220L;

	
	public ResourceDuplicateException() {
		
	}
	
	public ResourceDuplicateException(String message, Throwable cause, boolean
			enableSuppression, boolean writableStackTrace) { 
		super(message, cause,enableSuppression, writableStackTrace); 
	}

	public ResourceDuplicateException(String message, Throwable cause) {
		super(message, cause);
	}

	public ResourceDuplicateException(String message) { 
		super(message); 
	}

	public ResourceDuplicateException(Throwable cause) { 
		super(cause);
	}
}

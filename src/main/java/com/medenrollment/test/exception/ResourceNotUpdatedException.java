package com.medenrollment.test.exception;

public class ResourceNotUpdatedException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1155428565418073583L;
	
	public ResourceNotUpdatedException() {
		super();
	}


	public ResourceNotUpdatedException(String message, Throwable cause, boolean
			enableSuppression, boolean writableStackTrace) { 
		super(message, cause,enableSuppression, writableStackTrace); 
	}

	public ResourceNotUpdatedException(String message, Throwable cause) {
		super(message, cause);
	}

	public ResourceNotUpdatedException(String message) { 
		super(message); 
	}

	public ResourceNotUpdatedException(Throwable cause) { 
		super(cause);
	}

}

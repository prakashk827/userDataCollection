package com.wdu.exception;

public class GenericException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;
	private int statusCode;
	
	private String status;

	public GenericException() {
		super();

	}

	public GenericException(String message, int statusCode, String status) {
		super();
		this.message = message;
		this.statusCode = statusCode;
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}

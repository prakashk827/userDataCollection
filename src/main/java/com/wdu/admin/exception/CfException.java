package com.wdu.admin.exception;

import org.springframework.http.HttpStatus;

public class CfException extends Exception {

	
	 private static final long serialVersionUID = 1L;

	    private final HttpStatus status = null;

	    private final String code = null;
	    
	    

		public static long getSerialversionuid() {
			return serialVersionUID;
		}

		public HttpStatus getStatus() {
			return status;
		}

		public String getCode() {
			return code;
		}
	    
	    
	    
	    
	    
	    
}

package com.wdu.dto;

import java.util.List;
import java.util.Map;

public class ApiResponse {

	private int code;
	private String message = null;
	private List<Map<String, Object>> response ;

	public ApiResponse() {
		super();
		
	}

	public ApiResponse(int code, String message, List<Map<String, Object>> response) {
		super();
		this.code = code;
		this.message = message ;
		this.response = response;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<Map<String, Object>> getResponse() {
		return response;
	}

	public void setResponse(List<Map<String, Object>> response) {
		this.response = response;
	}

}

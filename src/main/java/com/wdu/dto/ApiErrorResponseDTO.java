package com.wdu.dto;

public class ApiErrorResponseDTO {

	private String error;
	private int code;

	public ApiErrorResponseDTO() {
		super();

	}

	public ApiErrorResponseDTO(String error, int code) {
		super();
		this.error = error;
		this.code = code;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

}

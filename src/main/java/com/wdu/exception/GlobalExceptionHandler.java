package com.wdu.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.wdu.dto.ApiErrorResponseDTO;
import com.wdu.dto.ApiSuccessResponseDTO;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(value=GenericException.class)
	public ResponseEntity<?> genericExceptionHandler(GenericException ex){
		ResponseEntity<?> responseEntity = null;

		String msg = ex.getMessage();
		int code = ex.getStatusCode();
		String status = ex.getStatus().toLowerCase();

if (status.equals("success")) {
			ApiSuccessResponseDTO apiResponse = new ApiSuccessResponseDTO();
			apiResponse.setCode(code);
			apiResponse.setMessage(msg);
			responseEntity = HttpStatusCodesList.getHttpStatusCode(code, apiResponse);
		} else {

			ApiErrorResponseDTO apiResponse = new ApiErrorResponseDTO();
			apiResponse.setCode(code);
			apiResponse.setError(msg);
			responseEntity = HttpStatusCodesList.getHttpStatusCode(code, apiResponse);
		}

		return responseEntity;
	}

}

package com.wdu.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class HttpStatusCodesList {

	public static ResponseEntity<?> getHttpStatusCode(int code, Object apiResponse) {
		ResponseEntity<Object> responseEntity = null;

		switch (code) {

		case 200:
			responseEntity = new ResponseEntity<Object>(apiResponse, HttpStatus.OK);
			break;

		case 201:
			responseEntity = new ResponseEntity<Object>(apiResponse, HttpStatus.CREATED);
			break;
		case 202:
			responseEntity = new ResponseEntity<Object>(apiResponse, HttpStatus.ACCEPTED);
			break;

		case 203:
			responseEntity = new ResponseEntity<Object>(apiResponse, HttpStatus.NON_AUTHORITATIVE_INFORMATION);
			break;

		case 204:
			responseEntity = new ResponseEntity<Object>(apiResponse, HttpStatus.NO_CONTENT);
			break;
		case 205:
			responseEntity = new ResponseEntity<Object>(apiResponse, HttpStatus.RESET_CONTENT);
			break;

		case 400:
			responseEntity = new ResponseEntity<Object>(apiResponse, HttpStatus.BAD_REQUEST);
			break;

		case 401:
			responseEntity = new ResponseEntity<Object>(apiResponse, HttpStatus.UNAUTHORIZED);
			break;

		case 403:
			responseEntity = new ResponseEntity<Object>(apiResponse, HttpStatus.FORBIDDEN);
			break;

		case 404:
			responseEntity = new ResponseEntity<Object>(apiResponse, HttpStatus.NOT_FOUND);
			break;

		case 408:
			responseEntity = new ResponseEntity<Object>(apiResponse, HttpStatus.REQUEST_TIMEOUT);
			break;

		case 500:
			responseEntity = new ResponseEntity<Object>(apiResponse, HttpStatus.INTERNAL_SERVER_ERROR);
			break;

		case 502:
			responseEntity = new ResponseEntity<Object>(apiResponse, HttpStatus.BAD_GATEWAY);
			break;

		default:
			responseEntity = new ResponseEntity<Object>(apiResponse, HttpStatus.INTERNAL_SERVER_ERROR);
			break;

		}

		return responseEntity;

	}

}

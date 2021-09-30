package com.wdu.admin.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wdu.admin.dto.UserDataDTO;
import com.wdu.admin.service.UserDataService;
import com.wdu.exception.GenericException;

@RestController
@RequestMapping("/wdu_service")
public class UserDataController {

	@Autowired
	UserDataService service;

	@RequestMapping(value = "/data", method = RequestMethod.POST)
	public ResponseEntity<?> saveWebsiteData(@RequestBody UserDataDTO userData) throws GenericException {
		
		ResponseEntity<Object> responseEntity = null;
		
		int rowAffected = service.saveWebsiteData(userData);

		if (rowAffected > 0) {

			HashMap<String, Object> map = new HashMap<>();
			map.put("message", "Successfully inserted data");
			map.put("status", 200);

			responseEntity = new ResponseEntity<Object>(map, HttpStatus.OK);
		}
		
		return responseEntity;

	}

}

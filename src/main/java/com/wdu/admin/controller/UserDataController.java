package com.wdu.admin.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wdu.admin.dto.UserDataDTO;
import com.wdu.admin.exception.CfException;
import com.wdu.admin.repository.UserDatDao;


@RestController
@RequestMapping("/wdu_service")
public class UserDataController {

	
	@Autowired
    private UserDatDao userDataDao;

    @RequestMapping(value = "/data", method = RequestMethod.POST)
    public ResponseEntity<HashMap<String, Object>> persistPerson(@RequestBody UserDataDTO userData) throws CfException {
    	
        userDataDao.saveWebsiteData(userData);
        HashMap<String, Object> map = new HashMap<>();
        map.put("message", "Successfully inserted data");
        map.put("status", 200);
        return ResponseEntity.ok(map);
    }
	
}

package com.wdu.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wdu.admin.dto.UserDataDTO;
import com.wdu.admin.repository.UserDataDao;
import com.wdu.exception.GenericException;


@Service
public class UserDataService {

	@Autowired
	UserDataDao userDataDao;
	public int  saveWebsiteData(UserDataDTO userData) throws GenericException  {
		
		return userDataDao.saveWebsiteData(userData);
		
	}

}

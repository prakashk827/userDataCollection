package com.wdu.admin.repository;

import com.wdu.admin.dto.UserDataDTO;
import com.wdu.exception.GenericException;

public interface UserDataDao  {
	
	 public int  saveWebsiteData(UserDataDTO userData) throws GenericException ;
}

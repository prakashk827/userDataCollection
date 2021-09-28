package com.wdu.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.http.HttpStatus;

import com.wdu.exception.GenericException;

public class Utils {

	public static String getDateddMMyyyy() {

		String pattern = "dd-MM-yyyy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String date = simpleDateFormat.format(new Date());
		System.out.println(date);

		return date.toString();
	}

	public static String getTime() {

		DateFormat dateFormat = new SimpleDateFormat("hh.mm aa");
		String dateString = dateFormat.format(new Date()).toString();
		System.out.println(dateString);
		return dateString;

	}

	public static boolean validateMobileNumber(String mobileNo) throws GenericException {
		boolean isValid = false;
		String mobileRegex = "[0-9]{10}";

		if (mobileNo.matches(mobileRegex)) {
			isValid = true;
		} else {
			throw new GenericException("Please enter valid 10 digit mobile number", HttpStatus.BAD_REQUEST.value(),
					"error");
		}

		return isValid;
	}

	public static String getDateddMMyyyy(String announceDate) throws ParseException {
		
		String pattern = "dd-MM-yyyy";
		DateFormat formatter = new SimpleDateFormat(pattern);
		String date = formatter.parse(announceDate).toString();
		return date;
	}

}

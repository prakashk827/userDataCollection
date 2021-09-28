package com.wdu.model;

import com.wdu.utils.Utils;

public class CommonEntity {

	private String date = Utils.getDateddMMyyyy();
	private String time = Utils.getTime();

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

}

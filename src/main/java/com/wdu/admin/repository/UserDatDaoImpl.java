package com.wdu.admin.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.wdu.admin.dto.UserDataDTO;
import com.wdu.exception.GenericException;

@Repository
public class UserDatDaoImpl implements UserDataDao {

	@Autowired
	private NamedParameterJdbcTemplate loanfrontJdbcTemplate;

	@Override
	public int saveWebsiteData(UserDataDTO userData) throws GenericException {

		int rowAffected = 0;

		String sql = "INSERT INTO `wdu_website_datacollection`\n"
				+ "(`name`, `mobile`, `email`, `state`, `district`,`subject`,`message`,`source`)\n"
				+ "VALUES (:customerName, :mobile, :email, :state, :district,:subject,:message,:source)";
		try {
			SqlParameterSource params = new MapSqlParameterSource().addValue("customerName", userData.getName())
					.addValue("mobile", userData.getMobileNo()).addValue("email", userData.getEmail())
					.addValue("state", userData.getState()).addValue("district", userData.getDistrict())
					.addValue("subject", userData.getSubject()).addValue("message", userData.getMessage())
					.addValue("source", userData.getSource());
			
			loanfrontJdbcTemplate.update(sql, params);
		} catch (Exception ex) {
			ex.printStackTrace();
			throw new GenericException("Error while saving records !", 500, "error");

		}
		return rowAffected;

	}

}

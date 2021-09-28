package com.wdu.admin.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.wdu.admin.dto.UserDataDTO;
import com.wdu.admin.exception.CfException;

@Repository
public class UserDatDaoImpl implements UserDatDao {

	@Autowired
	private NamedParameterJdbcTemplate loanfrontJdbcTemplate;

	@Override
	public void saveWebsiteData(UserDataDTO userData) throws CfException {

		String sql = "INSERT INTO `lf_website_datacollection`\n"
				+ "(`name`, `mobile`, `email`, `state`, `district`,`subject`,`message`,`source`)\n"
				+ "VALUES (:customerName, :mobile, :email, :state, :district,:subject,:message,:source)";
		try {
			SqlParameterSource params = new MapSqlParameterSource().addValue("customerName", userData.getName())
					.addValue("mobile", userData.getMobileNo()).addValue("email", userData.getEmail())
					.addValue("state", userData.getState()).addValue("district", userData.getDistrict())
					.addValue("subject", userData.getSubject()).addValue("message", userData.getMessage())
					.addValue("source", userData.getSource());
			KeyHolder keyHolder = new GeneratedKeyHolder();
			loanfrontJdbcTemplate.update(sql, params, keyHolder);
		} catch (DataAccessException ex) {
			ex.printStackTrace(System.out);

		}

	}

}

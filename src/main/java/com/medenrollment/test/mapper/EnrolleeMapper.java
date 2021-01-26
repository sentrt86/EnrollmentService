package com.medenrollment.test.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.medenrollment.test.model.Enrollee;

public class EnrolleeMapper implements RowMapper {

	@Override
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		final Enrollee enrollee = new Enrollee();
		enrollee.setEnrolleeId(rs.getInt("ENROLLEE_ID"));
		enrollee.setEnrolleeName(rs.getString("ENROLLEE_NAME"));
		enrollee.setActivationStatus(rs.getBoolean("STATUS"));
		enrollee.setDateOfBirth(rs.getString("ENROLEE_DOB"));
		return enrollee;
	}

}

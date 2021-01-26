package com.medenrollment.test.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;

import com.medenrollment.test.model.Dependent;

public class DependentMapper implements RowMapper {


	@Override
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		final Dependent dependent = new Dependent();
		dependent.setDependentId(rs.getInt("DEPENDENT_ID"));
		dependent.setDependentName(rs.getString("DEPENDENT_NAME"));
		dependent.setDependentDob(rs.getString("DEPENDENT_DOB"));
		dependent.setRelationship(rs.getString("DEPENDENT_RELATIONSHIP"));
		return dependent;
	}

}

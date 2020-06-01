package com.ssafy.happyhouse.dao;

import java.sql.SQLException;

import com.ssafy.happyhouse.dto.MemberDto;


public interface LoginDao {

	public MemberDto login(String userid, String userpwd) throws SQLException;

	public String findpwd(String userid, String username, String email) throws SQLException;

	public MemberDto deleteInfo(String userpwd) throws SQLException;
	
}
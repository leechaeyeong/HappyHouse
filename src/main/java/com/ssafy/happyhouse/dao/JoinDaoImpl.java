package com.ssafy.happyhouse.dao;


import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ssafy.happyhouse.dto.MemberDto;


@Repository
public class JoinDaoImpl implements JoinDao {

	@Autowired
	SqlSession sqlSession;
	
	@Override
	public int join(MemberDto memberDto) throws Exception {
		System.out.println(memberDto.toString());
		return sqlSession.insert("query.join",memberDto);
	}

	@Override
	public int update(MemberDto memberDto) throws Exception {
		return sqlSession.update("query.update",memberDto);
	} 

}
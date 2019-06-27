package com.carpe.caes;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class CaseDAOImpl implements CaseDAO {

	@Inject
	private SqlSession sqlSession;

	private static final String Namespace = "com.carpe.mapper.caes";

	@Override
	public List<Map> selectCaseList(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectList(Namespace + ".selectCaseList", paramMap);
	}
	
	@Override
	public int insertCase(Map<String, Object> paramMap) throws Exception {
		return sqlSession.insert(Namespace + ".insertCase", paramMap);
	}
}
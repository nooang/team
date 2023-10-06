package com.ktdsuniversity.edu.compbbs.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ktdsuniversity.edu.compbbs.vo.CompBoardVO;

@Repository
public class CompBoardDAOImpl extends SqlSessionDaoSupport implements CompBoardDAO {
	@Autowired
	@Override
	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		super.setSqlSessionTemplate(sqlSessionTemplate);
	}
	
	@Override
	public int getBoardAllCount() {
		return getSqlSession().selectOne("getBoardAllCount");
	}

	@Override
	public List<CompBoardVO> compBoardList() {
		return getSqlSession().selectList("CompBoardVO");
	}

}

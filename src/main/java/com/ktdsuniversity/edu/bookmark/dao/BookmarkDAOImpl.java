package com.ktdsuniversity.edu.bookmark.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ktdsuniversity.edu.bookmark.vo.BookmarkVO;

@Repository
public class BookmarkDAOImpl extends SqlSessionDaoSupport implements BookmarkDAO {
	@Autowired
	@Override
	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		super.setSqlSessionTemplate(sqlSessionTemplate);
	}

	@Override
	public int getBookmarkAllCount() {
		return getSqlSession().selectOne("getBookmarkAllCount");
	}
	
	@Override
	public List<BookmarkVO> getAllBookmark() {
		return getSqlSession().selectList("getAllBookmark");
	}



}

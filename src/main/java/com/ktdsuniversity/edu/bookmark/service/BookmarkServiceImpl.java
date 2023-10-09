package com.ktdsuniversity.edu.bookmark.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ktdsuniversity.edu.bookmark.dao.BookmarkDAO;
import com.ktdsuniversity.edu.bookmark.vo.BookmarkListVO;
import com.ktdsuniversity.edu.bookmark.vo.BookmarkVO;

@Service
public class BookmarkServiceImpl implements BookmarkService {
	@Autowired
	private BookmarkDAO bookmarkDAO;
	
	@Override
	public BookmarkListVO getAllBookmark() {
		BookmarkListVO bookmarkListVO = new BookmarkListVO();
		bookmarkListVO.setBookmarkCnt(bookmarkDAO.getBookmarkAllCount());
		bookmarkListVO.setBookmarkList(bookmarkDAO.getAllBookmark());
		
		return bookmarkListVO;
	}
	
}

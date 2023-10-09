package com.ktdsuniversity.edu.bookmark.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ktdsuniversity.edu.bookmark.dao.BookmarkDAO;
import com.ktdsuniversity.edu.bookmark.vo.BookmarkListVO;
import com.ktdsuniversity.edu.bookmark.vo.BookmarkVO;
import com.ktdsuniversity.edu.compbbs.vo.CompBoardVO;

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

	@Override
	public CompBoardVO getOneBookmark(String id) {
		CompBoardVO compboardVO = bookmarkDAO.getOneBookmark(id); 
		return compboardVO;
	}
	
}

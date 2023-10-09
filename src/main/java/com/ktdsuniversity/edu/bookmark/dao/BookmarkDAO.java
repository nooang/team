package com.ktdsuniversity.edu.bookmark.dao;

import java.util.List;

import com.ktdsuniversity.edu.bookmark.vo.BookmarkVO;
import com.ktdsuniversity.edu.compbbs.vo.CompBoardVO;

public interface BookmarkDAO {
	public int getBookmarkAllCount();
	public List<BookmarkVO> getAllBookmark();
	public CompBoardVO getOneBookmark(String id);
}

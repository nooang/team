package com.ktdsuniversity.edu.bookmark.dao;

import java.util.List;

import com.ktdsuniversity.edu.bookmark.vo.BookmarkVO;

public interface BookmarkDAO {
	public int getBookmarkAllCount();
	public List<BookmarkVO> getAllBookmark();
}

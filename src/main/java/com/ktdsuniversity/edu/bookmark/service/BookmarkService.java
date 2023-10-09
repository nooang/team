package com.ktdsuniversity.edu.bookmark.service;

import com.ktdsuniversity.edu.bookmark.vo.BookmarkListVO;
import com.ktdsuniversity.edu.compbbs.vo.CompBoardVO;

public interface BookmarkService {
	public BookmarkListVO getAllBookmark();
	public CompBoardVO getOneBookmark(String id);
}

package com.ktdsuniversity.edu.bookmark.vo;

import java.util.List;

public class BookmarkListVO {
	private int bookmarkCnt;
	
	
	int getBookmarkCnt() {
		return bookmarkCnt;
	}
	void setBookmarkCnt(int bookmarkCnt) {
		this.bookmarkCnt = bookmarkCnt;
	}
	List<BookmarkVO> getBookmarkList() {
		return bookmarkList;
	}
	void setBookmarkList(List<BookmarkVO> bookmarkList) {
		this.bookmarkList = bookmarkList;
	}
	private List<BookmarkVO> bookmarkList;
}

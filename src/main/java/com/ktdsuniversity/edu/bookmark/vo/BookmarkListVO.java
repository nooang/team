package com.ktdsuniversity.edu.bookmark.vo;

import java.util.List;

public class BookmarkListVO {
	private int bookmarkCnt;
	private List<BookmarkVO> bookmarkList;
	
	
	public int getBookmarkCnt() {
		return bookmarkCnt;
	}
	public void setBookmarkCnt(int bookmarkCnt) {
		this.bookmarkCnt = bookmarkCnt;
	}
	public List<BookmarkVO> getBookmarkList() {
		return bookmarkList;
	}
	public void setBookmarkList(List<BookmarkVO> bookmarkList) {
		this.bookmarkList = bookmarkList;
	}
}

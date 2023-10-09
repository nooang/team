package com.ktdsuniversity.edu.bookmark.vo;

public class BookmarkVO {
	private String bookmarkId;
	private String generalMemberId;
	private String boardId;
	private String postId;
	private String bookmarkYn;
	
	
	String getBookmarkId() {
		return bookmarkId;
	}
	void setBookmarkId(String bookmarkId) {
		this.bookmarkId = bookmarkId;
	}
	String getGeneralMemberId() {
		return generalMemberId;
	}
	void setGeneralMemberId(String generalMemberId) {
		this.generalMemberId = generalMemberId;
	}
	String getBoardId() {
		return boardId;
	}
	void setBoardId(String boardId) {
		this.boardId = boardId;
	}
	String getPostId() {
		return postId;
	}
	void setPostId(String postId) {
		this.postId = postId;
	}
	String getBookmarkYn() {
		return bookmarkYn;
	}
	void setBookmarkYn(String bookmarkYn) {
		this.bookmarkYn = bookmarkYn;
	}
}

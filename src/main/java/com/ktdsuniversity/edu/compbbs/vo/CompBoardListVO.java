package com.ktdsuniversity.edu.compbbs.vo;

import java.util.List;

public class CompBoardListVO {
	private int compBoardCnt;
	private List<CompBoardVO> compBoardList;
	
	
	public int getCompBoardCnt() {
		return compBoardCnt;
	}
	public void setCompBoardCnt(int compBoardCnt) {
		this.compBoardCnt = compBoardCnt;
	}
	public List<CompBoardVO> getCompBoardList() {
		return compBoardList;
	}
	public void setCompBoardList(List<CompBoardVO> compBoardList) {
		this.compBoardList = compBoardList;
	}
}

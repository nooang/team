package com.ktdsuniversity.edu.compbbs.dao;

import java.util.List;

import com.ktdsuniversity.edu.compbbs.vo.CompBoardVO;

public interface CompBoardDAO {
	public int getBoardAllCount();
	public List<CompBoardVO> compBoardList();
}

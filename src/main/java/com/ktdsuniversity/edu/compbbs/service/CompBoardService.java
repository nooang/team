package com.ktdsuniversity.edu.compbbs.service;

import com.ktdsuniversity.edu.compbbs.vo.CompBoardListVO;
import com.ktdsuniversity.edu.compbbs.vo.CompBoardVO;

public interface CompBoardService {
	public CompBoardListVO getAllCompBoard();
	public boolean createNewCompBoard(CompBoardVO compBoardVO);
}

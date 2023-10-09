package com.ktdsuniversity.edu.compbbs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ktdsuniversity.edu.compbbs.dao.CompBoardDAO;
import com.ktdsuniversity.edu.compbbs.vo.CompBoardListVO;
import com.ktdsuniversity.edu.compbbs.vo.CompBoardVO;

@Service
public class CompBoardServiceImpl implements CompBoardService {
	@Autowired
	private CompBoardDAO compBoardDAO;

	@Override
	public CompBoardListVO getAllCompBoard() {
		CompBoardListVO compBoardListVO = new CompBoardListVO();
		compBoardListVO.setCompBoardCnt(compBoardDAO.getCompBoardAllCount());
		compBoardListVO.setCompBoardList(compBoardDAO.getAllCompBoardList());
		return compBoardListVO;
	}

	@Override
	public boolean createNewCompBoard(CompBoardVO compBoardVO) {
		return compBoardDAO.createOneCompBoard(compBoardVO) > 0;
	}
	
	

}

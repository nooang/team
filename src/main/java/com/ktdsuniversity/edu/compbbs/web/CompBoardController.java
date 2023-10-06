package com.ktdsuniversity.edu.compbbs.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ktdsuniversity.edu.compbbs.service.CompBoardService;
import com.ktdsuniversity.edu.compbbs.vo.CompBoardListVO;


@Controller
public class CompBoardController {
	@Autowired
	private CompBoardService compBoardService;
	
	@GetMapping("/company/board/temp")
	public ModelAndView compBoardTempPage() {
		ModelAndView mav = new ModelAndView();
		CompBoardListVO compBoardListVO = compBoardService.getAllCompBoard();
		
		mav.setViewName("compboardtemp");
		mav.addObject("compBoardListVO", compBoardListVO);
		return mav;
	}
}

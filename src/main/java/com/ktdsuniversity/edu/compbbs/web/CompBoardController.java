package com.ktdsuniversity.edu.compbbs.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ktdsuniversity.edu.compbbs.service.CompBoardService;
import com.ktdsuniversity.edu.compbbs.vo.CompBoardListVO;
import com.ktdsuniversity.edu.compbbs.vo.CompBoardVO;


@Controller
public class CompBoardController {
	@Autowired
	private CompBoardService compBoardService;
	
	@GetMapping("/company/board/temp")
	public ModelAndView compBoardTempPage() {
		ModelAndView mav = new ModelAndView();
		CompBoardListVO compBoardListVO = compBoardService.getAllCompBoard();
		
		mav.setViewName("company/compboardtemp");
		mav.addObject("compBoardListVO", compBoardListVO);
		return mav;
	}
	
	@GetMapping("company/board/createcompboard")
	public String createNewCompBoard() {
		return "company/createcompboard";
	}
	
	@PostMapping("company/board/createcompboard")
	public ModelAndView createNewCompBoard(@ModelAttribute CompBoardVO compBoardVO) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("company/createcompboard");
		mav.addObject("compBoardVO", compBoardVO);
		
		return mav;
	}
}

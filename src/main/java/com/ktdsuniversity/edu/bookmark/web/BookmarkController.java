package com.ktdsuniversity.edu.bookmark.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ktdsuniversity.edu.bookmark.service.BookmarkService;
import com.ktdsuniversity.edu.bookmark.vo.BookmarkListVO;
import com.ktdsuniversity.edu.compbbs.vo.CompBoardVO;

@Controller
public class BookmarkController {
	@Autowired
	private BookmarkService bookmarkService;
	
	@GetMapping("/mypage/bookmark/list")
	public ModelAndView viewBookmarkList() {
		ModelAndView mav = new ModelAndView();
		BookmarkListVO bookmarkListVO = bookmarkService.getAllBookmark();
		
		mav.setViewName("bookmark/bookmarklist");
		mav.addObject("bookmarkListVO", bookmarkListVO);
		
		return mav;
	}
	
	@GetMapping("/mypage/bookmark/view")
	public ModelAndView viewOneBookmark(@RequestParam String id) {
		ModelAndView mav = new ModelAndView();
		CompBoardVO compboardVO = bookmarkService.getOneBookmark(id);
		mav.setViewName("bookmark/bookmarkview");
		mav.addObject("compboardVO", compboardVO);
		
		return mav;
	}
}

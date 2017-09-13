package com.rimi.j1702.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * @author rimi
 *
 */
@Controller
public class goodsController {
	@RequestMapping("abc")
	public ModelAndView  goodsList(){
		return new ModelAndView("itemList");
	}

}

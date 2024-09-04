package com.bookapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@GetMapping(path="hello")
	public ModelAndView hello() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("mypage");
		mv.addObject("key", "i am champion and i am grestest!");
		return mv;
	}
}

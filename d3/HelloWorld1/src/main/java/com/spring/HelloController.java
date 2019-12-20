package com.spring;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class HelloController {
	@RequestMapping("/hello")
	public ModelAndView calc2(HttpServletRequest req,HttpServletResponse res){
		return new ModelAndView("resultpage", "message", "welcome to spring");
		
	}
	
	@RequestMapping("/about")
	public ModelAndView calc(HttpServletRequest req,HttpServletResponse res){
		return new ModelAndView("about");
		
	}
	@RequestMapping("/contact")
	public ModelAndView calc1(HttpServletRequest req,HttpServletResponse res){
		return new ModelAndView("contact");
		
	}

}

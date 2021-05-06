package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

	@Controller
	public class HelloWorldController {
	 
		@RequestMapping("/welcome")
		public ModelAndView welcomeWorld() {
			String message = "Welcome Anurag, Click on below link to see password";
			return new ModelAndView("welcome", "message", message);
		}
}
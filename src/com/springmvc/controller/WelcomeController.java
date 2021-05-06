package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

	@RequestMapping("/hello")
	public ModelAndView helloWorld() {
		String hello = "Hello Anurag, Your password is R@ve1992";
		return new ModelAndView("hello", "hello", hello);
	}
}
package com.springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	@RequestMapping("/login")
	public String doLogin(HttpServletRequest request, @RequestParam("password") String password, Model model) {
		String name = request.getParameter("name");
		
		if (password.equalsIgnoreCase("pass")) {
			model.addAttribute("message", "Welcome ! " +name);
			return "success";
		} else {
			model.addAttribute("message", "Sorry! Password is pass");
			return "error";
		}
	}

}

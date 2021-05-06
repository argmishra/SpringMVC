package com.springmvc.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springmvc.pojo.User;

@Controller

public class UserRegisterController {

	@RequestMapping(value ="booking", method = RequestMethod.GET)
	public String bookingForm(Model model) {
		model.addAttribute("user", new User());
		return "register";
	}

	@RequestMapping("/submit")
	public String submitForm(@ModelAttribute("user") @Valid User user, BindingResult br) {
		if(br.hasErrors()) {
			return "register";
		} else {
			return "confirmation";
		}
	}

}

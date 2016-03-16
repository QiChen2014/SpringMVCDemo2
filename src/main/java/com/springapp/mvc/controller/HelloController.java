package com.springapp.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HelloController {
	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", "Hello world!");
		return "hi";
	}

	@RequestMapping(value = "/test1",method = RequestMethod.GET)
	public String test1(Model model,String name) {
		System.out.println(name);
		model.addAttribute("message", name);
		return "hello";
	}
}
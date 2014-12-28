package org.buele.pinwheel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.ModelMap;

 
@Controller
@RequestMapping("/hello")
public class HelloController{
	@RequestMapping(method=RequestMethod.GET)
	public String hello(ModelMap model) {
		model.addAttribute("message", "Spring 3 MVC Hello World");
		return "hello";
	}
}
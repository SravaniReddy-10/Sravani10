package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RechargeController {

	
	
	@RequestMapping("/")
	public String home() {
		
		return"home";
	}
	
	@PostMapping("showData")
	public ModelAndView showData(@RequestParam("operator") Integer operatorId,@RequestParam("phonenumber") Long phonenumber) {
		
		ModelAndView mv = new ModelAndView("plandetails");
		mv.addObject("phonenumber",phonenumber);
		
		
		return mv;
		
	}
}



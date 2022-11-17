package com.MobileRecharge.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.MobileRecharge.Service.RechargeService;

@RestController
public class RechargeController {

	@Autowired
	RechargeService rechargeService;
	
	@RequestMapping("/")
	public String home() {
		
	return "home" ;
		
	}
}

package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.repository.BillRepository;
import com.example.demo.repository.OfferRepository;

@Controller
public class RechargeController {
	
	@Autowired
	OfferRepository oRepo;
	
	@Autowired
	BillRepository bRepo;

	
	
	@RequestMapping("/")
	public String home() {
		
		return"home";
	}
	
	@PostMapping("showDetails")
	public ModelAndView showDetails(@RequestParam("operator") Integer operatorId,@RequestParam("phonenumber") Long phoneNumber ) {
		
		ModelAndView mv = new ModelAndView("plandetails");
		mv.addObject("offerslists",oRepo.findByOperator(operatorId));
		mv.addObject("phonenumber",phoneNumber );
		return mv;
		
	}
}



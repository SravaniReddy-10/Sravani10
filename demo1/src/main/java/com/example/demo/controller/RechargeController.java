package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Bill;
import com.example.demo.entity.Offer;
import com.example.demo.repository.BillRepository;
import com.example.demo.repository.OfferRepository;

@Controller
public class RechargeController {
	
	@Autowired
	OfferRepository offerRepo;
	
	@Autowired
	BillRepository billRepo;

	
	
	@RequestMapping("/")
	public String home() {
		
		return"home";
	}
	
	@PostMapping("showDetails")
	public ModelAndView showDetails(@RequestParam("operator") Integer operatorId,@RequestParam("phonenumber") Long phoneNumber ) {
		
		ModelAndView mv = new ModelAndView("plandetails");
		mv.addObject("offerslists",offerRepo.findByOperator(operatorId));
		mv.addObject("phonenumber",phoneNumber );
		return mv;
		
	}
	
	@PostMapping("saveDetails")
	public ModelAndView saveDetails(@RequestParam("planId") Integer planId,@RequestParam("phonenumber") Long phoneNumber ) {
		
		ModelAndView mv = new ModelAndView("paymentdetails");
		Offer obj = offerRepo.findById(planId).orElse(new Offer());
		Bill  bill = new Bill();
		bill.setPhoneNumber(phoneNumber);
		bill.setPlanId(planId);
		billRepo.save(bill);
		mv.addObject("plandata",obj);
		mv.addObject("phonenumber",phoneNumber );
		return mv;
	}
}



package com.study.bankprocess.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.study.bankprocess.service.BankSerice;

@Controller
@RequestMapping(value = "/bank")
public class BankHomeContoller {

	@Autowired
	BankSerice service;

	@GetMapping(value = "/home")
	public String home() {
		return "bankhome";
	}

	@GetMapping(value = "/viewtransaction")
	public String showTransaction() {
		return "viewtransaction";

	}

	@PostMapping(value = "/listtrans")
	public ModelAndView listTrans(@ModelAttribute("acctNum") String acctNum) {

		return new ModelAndView("listtrans", "list", service.listTrans(acctNum));

	}
	
	@GetMapping(value = "/deposite")
	public String deposite() {
		return "deposite";

	}
	
	@GetMapping(value = "/wihdrawl")
	public String wihdrawl() {
		return "wihdrawlpage";

	}
	
	@GetMapping(value = "/createaccount")
	public String createAccount() {
		return "createaccount";

	}
	
	@GetMapping(value = "/login")
	public String login() {
		return "login";

	}
	

}

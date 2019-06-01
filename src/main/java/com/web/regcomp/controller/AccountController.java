package com.web.regcomp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.web.regcomp.repository.AccountRepository;
import com.web.regcomp.repository.TransactionRepository;

@Controller
public class AccountController {
	
	@Autowired
	AccountRepository accountRepo;
	
	@Autowired
	TransactionRepository transRepo;
	
	@RequestMapping("/home") 
	public String accounts(Model model) {
		model.addAttribute("accounts", accountRepo.findAll());
		return "accounts";
	}
	
	@RequestMapping("/details") 
	public String transactions(Model model, @RequestParam(value="accountNumber", required=true) Long accountNumber) {
		model.addAttribute("transactions", transRepo.findByAccountNum(accountNumber));
		return "transactions";
	}

}

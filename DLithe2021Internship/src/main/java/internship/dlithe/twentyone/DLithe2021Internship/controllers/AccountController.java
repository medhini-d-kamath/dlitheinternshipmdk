package internship.dlithe.twentyone.DLithe2021Internship.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import internship.dlithe.twentyone.DLithe2021Internship.model.Account;

@Controller
public class AccountController 
{
	@Autowired
	ServiceAccount service;
	
	@RequestMapping("/sign")
	public String kyc(Model model)
	{
		Account acc=new Account();
		model.addAttribute("obj", acc);
		return "signup";
	}
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String adding(Model model,@ModelAttribute("holder") Account holder)
	{
		System.out.println(holder);
		String name=service.insert(holder);
		model.addAttribute("msg", name);
		return "signup";
	}
}

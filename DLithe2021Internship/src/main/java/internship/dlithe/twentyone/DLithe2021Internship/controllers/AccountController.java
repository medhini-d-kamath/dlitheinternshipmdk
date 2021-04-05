package internship.dlithe.twentyone.DLithe2021Internship.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AccountController 
{
	@RequestMapping("/sign")
	public String kyc()
	{
		return "signup";
	}
}

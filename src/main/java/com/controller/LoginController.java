package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.service.IUserService;

@Controller
public class LoginController {

	@Autowired
	private IUserService service;
	
	@RequestMapping("/loginCheck")
	public String loginCheck(@RequestParam(name="username",required=false,defaultValue="" )String username){
		boolean isUsername = service.selectUserName(username);
		if(isUsername){
			
			return "redirect:/index.html";
		}
		else{
			return "fail";

		}
	}
	
}

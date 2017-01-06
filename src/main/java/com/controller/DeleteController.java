package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.service.IFilmService;

@Controller
public class DeleteController {

	@Autowired
	private IFilmService service;
	
	@RequestMapping("delete")
	public String deleteById(@RequestParam(name="id",required=false,defaultValue="" )int id){
		//前台js中拿到的是字符串类型的ID
		//int newId=Integer.parseInt(id);
		service.deleteById(id);
		return "deleteSuccess";
		
	}
}

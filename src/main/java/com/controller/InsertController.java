package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bean.Film;
import com.service.IFilmService;

@Controller
public class InsertController {

	@Autowired
	private IFilmService service;
	
	@RequestMapping("/insertFilm")
	public String insert(@RequestParam(name="title",required=false,defaultValue="" )String title,
			@RequestParam(name="description",required=false,defaultValue="" )String description,
			@RequestParam(name="language_id",required=false,defaultValue="" )int language_id
			){
		
		Film film = new Film();
		film.setTitle(title);
		film.setDescription(description);
		film.setLanguage_id(language_id);
		service.insertFilm(film);
		System.out.println("插入成功"+film);
		
		
		return "insertSuccess";
	}
}

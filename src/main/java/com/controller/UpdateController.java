package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bean.Film;
import com.service.IFilmService;

@Controller
public class UpdateController {
	
	@Autowired
	private IFilmService service;
	
	@RequestMapping("/updateFilm")
	public String update(@RequestParam(name="film_id",required=false,defaultValue="")int film_id,
			@RequestParam(name="title",required=false,defaultValue="")String title,
			@RequestParam(name="description",required=false,defaultValue="")String description,
			@RequestParam(name="language_id",required=false,defaultValue="")int language_id
			){
		
		Film film = new Film();
		film.setFilm_id(film_id);
		film.setTitle(title);
		film.setLanguage_id(language_id);
		film.setDescription(description);
		service.update(film);
		return "updateSuccess";
	}
}

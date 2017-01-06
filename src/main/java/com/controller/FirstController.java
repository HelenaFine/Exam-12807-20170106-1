package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Film;
import com.bean.Page;
import com.bean.ResponseData;
import com.service.IFilmService;

@RestController

public class FirstController {

	@Autowired
	private IFilmService service;

	@RequestMapping(path = "/first" , method = RequestMethod.GET)
	public ResponseData<Film> query(
			@RequestParam(name="title",required=false,defaultValue="" ) String title,
			@RequestParam(name="film_id",required=false,defaultValue="1") int film_id,
			@RequestParam(name="page",required=false,defaultValue="1") int page,
			@RequestParam(name="pageSize",required=false,defaultValue="10") int pageSize){
		Page<Film> p = new Page<Film>();
		Film  film = new Film();
		film.setFilm_id(film_id);
		film.setTitle(title);
		p.setPage(page);
		p.setPageSize(pageSize);
		p.setEntity(film);
	//	System.out.println(service.queryAll(p).getTotal());
		return  service.queryAll(p);
	}
}

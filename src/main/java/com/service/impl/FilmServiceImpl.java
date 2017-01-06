package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bean.Film;
import com.bean.Page;
import com.bean.ResponseData;
import com.dao.FilmDao;
import com.service.IFilmService;

@Component
public class FilmServiceImpl implements IFilmService{

	@Autowired
	private FilmDao dao;

	public ResponseData<Film> queryAll(Page<Film> page) {
		ResponseData<Film> r = new ResponseData<>();
		r.setRows(dao.queryAll(page));
		r.setTotal(dao.count(page));
		return r;
	}


	public int count(Page<Film> page) {
		
		return dao.count(page);
	}


	public void insertFilm(Film film) {
		dao.insertNewFilm(film);
	}


	@Override
	public void deleteById(long id) {
		dao.deleteById(id);
	}


	@Override
	public void update(Film film) {
		dao.updateFilm(film);
	}
	
	

}

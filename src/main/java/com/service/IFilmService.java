package com.service;

import java.util.List;

import com.bean.Film;
import com.bean.Page;
import com.bean.ResponseData;

public interface IFilmService {

	public  ResponseData<Film> queryAll(Page<Film> page);
	public int count(Page<Film> page);
	
	
	//插入新的film
	public void insertFilm(Film film);
	//删除
	public void deleteById(long id);
	
	//更新
	public void update(Film film);
}

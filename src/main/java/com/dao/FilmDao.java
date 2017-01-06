package com.dao;

import java.util.List;

import com.bean.Film;
import com.bean.Page;


public interface FilmDao {

	//查询所有film(分页)
	public List<Film> queryAll(Page<Film> page);
	//查询所有满足条件条数
	public int count(Page<Film> page);
	
	
	//根据ID查询film
	public Film queryById(long film_id);
	//根据title查询film
	public Film queryByTitle(String Title);
	//根据Id删除Film
	public void deleteById(long film_id);
	//根据id修改Film
	public void updateFilm(Film file);
	
	//插入
	public void insertNewFilm(Film file);
	
	
	//查询登录姓名
	public String selectUserName(String name);
	
	
	
	
}

package com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dao.FilmDao;
import com.service.IUserService;

@Component
public class UserServiceImpl implements IUserService{

	@Autowired
	private FilmDao dao;

	@Override
	public boolean selectUserName(String name) {
		String username = dao.selectUserName(name);
		if(username!=null){
			return true;
		}
		else{
			return false;
		}
	}
	
	
}

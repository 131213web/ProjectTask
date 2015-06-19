package com.musicshare.service;

import com.musicshare.bean.User;
import com.musicshare.dao.UserDao;
import com.musicshare.exception.MsgException;

public class UserService {

	private UserDao userDao = new UserDao();
	
	public void register(User user) {
		if (!userDao.addUser(user)) {
			throw new MsgException("×¢²áÊ§°Ü");
		}
	}
	
	public void login(String usr, String pwd) {
		if (userDao.find(usr, pwd) == null) {
			throw new MsgException("µÇÂ½Ê§°Ü");
		}
	}
}

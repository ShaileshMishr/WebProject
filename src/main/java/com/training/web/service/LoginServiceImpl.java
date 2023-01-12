package com.training.web.service;

import java.util.List;

import com.training.web.dao.LoginDao;
import com.training.web.dao.LoginDaoImpl;
import com.training.web.model.Regis;
import com.training.web.model.User;

public class LoginServiceImpl implements LoginService{

	LoginDao dao = new LoginDaoImpl();
	@Override
	public boolean isValidUser(String username, String password) {
		
		
		boolean isValid = false;
		List<User> userList = dao.getUsers();
		
		for(User user:userList) {
			if(user.getUserName().equals(username) && user.getPassword().equals(password)) {
				isValid = true;
			}
		}
		
		return isValid;
	}
	
	public boolean isValidRegis(String mobileNo) {
		
		
		boolean isValid = false;
		List<Regis> regisList = dao.getRegis();
		
		for(Regis regis:regisList) {
			if(regis.getMobileNo().equals(mobileNo)) {
				isValid = true;
			}
		}
		
		return isValid;
	}

	@Override
	public List<User> getUsers() {
		List<User> userList = dao.getUsers();
		return userList;
	}

	@Override
	public List<Regis> getRegis() {
		List<Regis> regisList = dao.getRegis();
		return null;
	}
}

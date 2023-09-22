package com.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.Beans.User;
import com.demo.Dao.UserDao;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userdao;

	@Override
	public User addUser(User user) {
		
		return userdao.save(user);
	}

	@Override
	public List<User> getUser() {
		
		return userdao.findAll();
	}
	
}

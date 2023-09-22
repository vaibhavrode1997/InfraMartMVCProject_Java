package com.demo.Service;

import java.util.List;

import com.demo.Beans.User;

public interface UserService {

	User addUser(User user);

	List<User> getUser();

}

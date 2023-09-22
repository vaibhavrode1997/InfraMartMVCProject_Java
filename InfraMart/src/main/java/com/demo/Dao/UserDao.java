package com.demo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.Beans.User;

@Repository
public interface UserDao extends JpaRepository<User, Integer>{

	
}

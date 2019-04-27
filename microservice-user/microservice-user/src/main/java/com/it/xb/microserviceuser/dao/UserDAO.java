package com.it.xb.microserviceuser.dao;

import org.springframework.stereotype.Repository;

import com.it.xb.microserviceuser.entity.User;

@Repository
public interface UserDAO {
	
	User selectByPrimary(String id);
}

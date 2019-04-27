package com.it.xb.microserviceuser.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.it.xb.microserviceuser.dao.UserDAO;
import com.it.xb.microserviceuser.entity.User;
import com.it.xb.microserviceuser.repository.UserRepository;
import com.it.xb.microserviceuser.util.LogUtil;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("userController")
@Slf4j
public class UserController {

	@Autowired
	private UserDAO userDAO;
	
	@Autowired
	private UserRepository userRepository;

	@PostMapping("/queryUser")
	public User queryUser(@RequestBody String id) {
		return userDAO.selectByPrimary(id);
	}
	
	@GetMapping("/findById/{id}")
	public void findById(@PathVariable String id ) {
		LogUtil.info(log, "com.it.xb.microserviceuser.rest.UserController.findById(String) param:{}", id);
		Optional<User> result = userRepository.findById(id);
		LogUtil.info(log, JSON.toJSONString(result));
		
	}
	
}

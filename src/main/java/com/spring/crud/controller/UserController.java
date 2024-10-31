package com.spring.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.crud.entity.UserEntity;
import com.spring.crud.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/saveUser")
	public UserEntity saveUser(@RequestBody UserEntity user) {
		return userService.saveUser(user);
	}
	
	@GetMapping("/getAllUser")
	public List<UserEntity> getAllUsers(){
		return userService.getAllUsers();
	}
}

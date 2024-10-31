package com.spring.crud.service;

import java.util.List;

import com.spring.crud.entity.UserEntity;

public interface IUserService {
	//SAVE USER 
	UserEntity saveUser(UserEntity user);
	
	//GET ALL USERS 
	List<UserEntity> getAllUsers();
	
}

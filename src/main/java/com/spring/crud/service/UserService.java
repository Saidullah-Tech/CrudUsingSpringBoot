package com.spring.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.crud.entity.UserEntity;
import com.spring.crud.repo.UserRepository;

@Service
public class UserService implements IUserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserEntity saveUser(UserEntity user) {
		return userRepository.save(user);
	}

	@Override
	public List<UserEntity> getAllUsers() {
		return userRepository.findAll();
	}

}

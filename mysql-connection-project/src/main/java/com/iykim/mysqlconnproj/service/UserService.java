package com.iykim.mysqlconnproj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iykim.mysqlconnproj.dto.UserDto;
import com.iykim.mysqlconnproj.model.User;
import com.iykim.mysqlconnproj.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepo;

	// ****** GET ******
	public User findUserByEmail(String email) {
		return userRepo.findUserByEmail(email);
	}

	public User findUserById(int id) {
		// TODO Auto-generated method stub
		return userRepo.findUserById(id);
	}

	// ****** POST ******
//	public void addNewUser(UserDto userDto) {
//		userRepo.addNewUser(userDto);
//	}

}

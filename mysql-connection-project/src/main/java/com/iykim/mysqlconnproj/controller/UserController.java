package com.iykim.mysqlconnproj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.iykim.mysqlconnproj.entity.UserEntity;
import com.iykim.mysqlconnproj.repository.UserRepository;

@RestController
@RequestMapping(path = "/user")
public class UserController {

	@Autowired
	private UserRepository userRepo;

	@PostMapping(path = "/add")
	public @ResponseBody String addNewUser(@RequestParam String firstName, @RequestParam String lastName,
			@RequestParam String email) {

		UserEntity newUser = new UserEntity();
		newUser.setFirstName(firstName);
		newUser.setLastName(lastName);
		newUser.setEmail(email);

		userRepo.save(newUser);

		return "New user successfully added!";
	}

	@GetMapping(path = "/all")
	public @ResponseBody Iterable<UserEntity> getAllUsers() {
		return userRepo.findAll();
	}
}

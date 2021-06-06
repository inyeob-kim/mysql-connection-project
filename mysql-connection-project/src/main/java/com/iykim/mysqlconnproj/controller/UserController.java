package com.iykim.mysqlconnproj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.iykim.mysqlconnproj.dto.UserDto;
import com.iykim.mysqlconnproj.service.UserService;

@RestController
@RequestMapping(path = "/user_account")
public class UserController {

	@Autowired
	private UserService userService;

	// GET
	@GetMapping("/email")
	public ResponseEntity<UserDto> getUserByEmail(@RequestParam String email) {
		return ResponseEntity.ok(UserDto.createUserDtoGET(userService.findUserByEmail(email)));
	}

	@GetMapping("/id")
	public ResponseEntity<UserDto> getUserById(@RequestParam int id) {
		return ResponseEntity.ok(UserDto.createUserDtoGET(userService.findUserById(id)));
	}

	// POST
//	@PostMapping("/add")
//	public ResponseEntity<?> addNewUser(@RequestParam String firstName, @RequestParam String lastName,
//			@RequestParam String email, @RequestParam String password) {
//		User newUser = new User();
//		newUser.setFirstName(firstName);
//		newUser.setLastName(lastName);
//		newUser.setEmail(email);
//		newUser.setPassword(password);
//		
//		UserDto userDto = UserDto.createUserDtoPOST(newUser);
//		userService.addNewUser(userDto);
//		
//		return ResponseEntity.ok("ok");
//	}

}

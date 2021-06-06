package com.iykim.mysqlconnproj.dto;

import com.iykim.mysqlconnproj.model.User;

public class UserDto {

	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;

	// constructor for fetching user
	private UserDto(int id, String firstName, String lastName, String email) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = null;
	}

	// constructor for adding new user --> need password...
	private UserDto(int id, String firstName, String lastName, String email, String password) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
	}

	/**
	 * This function creates UserDto of User Entity...
	 */
	public static UserDto createUserDtoGET(User user) {
		return new UserDto(user.getId(), user.getFirstName(), user.getLastName(), user.getEmail());
	}

	public static UserDto createUserDtoPOST(User user) {
		return new UserDto(user.getId(), user.getFirstName(), user.getLastName(), user.getEmail(), user.getPassword());
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}

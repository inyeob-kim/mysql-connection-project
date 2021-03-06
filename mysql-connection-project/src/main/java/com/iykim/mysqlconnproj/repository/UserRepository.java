package com.iykim.mysqlconnproj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.iykim.mysqlconnproj.dto.UserDto;
import com.iykim.mysqlconnproj.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	// GET QUERY
	User findUserByEmail(String email);

	User findUserById(int id);

	// POST QUERY

//	String addNewUserQuery = "";
//
//	@Query(addNewUserQuery)
//	static void addNewUser(UserDto userDto) {
//		String firstName = userDto.getFirstName();
//		String lastName = userDto.getLastName();
//		String email = userDto.getEmail();
//		String password = userDto.getPassword();
//		
//		addNewUserQuery = "INSERT INTO user_account VALUE (" + firstName + "," + lastName + "," + email + "," + password + ")";
//	}

}

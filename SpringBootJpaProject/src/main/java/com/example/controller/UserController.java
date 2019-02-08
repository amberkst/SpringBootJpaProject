package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.User;
import com.example.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userserv;

	@PostMapping("/add/user")
	public long addUserData(@RequestBody User user) {
		return userserv.addUser(user);
	}

	@GetMapping("/get/user")
	public List<User> getUserData() {
		List id = userserv.getUser();
		return id;
	}

	@GetMapping("/get/user/{id}")
	public Optional<User> getUserByid(@PathVariable Long id){
		Optional<User> uId= userserv.getUserById(id);
		return uId;	
	}
	
	/*
	 * @PostMapping("/update/user") public String updateUserData(@RequestBody User
	 * user) { long id=user.getuId(); userserv.deleteUser(id);
	 * userserv.addUser(user); return "user updated"; }
	 */
	
	@DeleteMapping("/delete/user/{id}")
	public String deleteUser(@PathVariable("id") Long id) {	
		 userserv.deleteUser(id);
		 return "User deleted";
	}
	
	@DeleteMapping("/delete/alluser")
	public String deleteAllUser() {
		userserv.deleteAllUserData();
		return "All user deleted successfully";
	}
	
	
}

package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.User;
import com.example.repo.UserRepo;

@Service
public class UserService {

	@Autowired
	UserRepo userrepo;

	public long addUser(User user) {
		User id = userrepo.save(user);
		return id.getuId();
	}

	public List getUser() {
		return userrepo.findAll();
	}

	public void deleteUser(Long id) {
		userrepo.deleteById(id);
	}

	public Optional<User> getUserById(Long id) {

		return userrepo.findById(id);
	}

	public void deleteAllUserData() {
       userrepo.deleteAll();
	}

}

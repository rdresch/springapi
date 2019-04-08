package com.dresch.springapi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dresch.springapi.domain.User;
import com.dresch.springapi.repositories.UserRepository;

@Service
public class UserService {
	
	//Instancia automaticamente a UserRepository
	@Autowired
	private UserRepository repo;
	
	public User findById(Integer id) {
		User obj = repo.getOne(id);
		return obj;
	}
	
}

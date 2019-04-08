package com.dresch.springapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dresch.springapi.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	
		
}

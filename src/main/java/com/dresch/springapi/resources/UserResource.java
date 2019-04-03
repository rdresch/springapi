package com.dresch.springapi.resources;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dresch.springapi.domain.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {

	@RequestMapping(method=RequestMethod.GET)
	public List<User> listUsers() {
		User u = new User(1, "Rafael","","","","","","","","","");
		
		List<User> list = new ArrayList<>();
		list.add(u);
		
		
				return list;
	}
	
}

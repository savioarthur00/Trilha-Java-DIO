package com.bootcamp.SantanderApiRestFull.service;

import com.bootcamp.SantanderApiRestFul.model.User;

public interface UserService  {
	
	User findById(Long id);
	
	User create (User userToCreate);
	
	

}

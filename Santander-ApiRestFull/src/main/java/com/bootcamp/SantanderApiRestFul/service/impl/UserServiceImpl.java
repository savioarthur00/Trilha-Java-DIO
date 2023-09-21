package com.bootcamp.SantanderApiRestFul.service.impl;

import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.bootcamp.SantanderApiRestFul.model.User;
import com.bootcamp.SantanderApiRestFul.repository.UserRepository;
import com.bootcamp.SantanderApiRestFull.service.UserService;

@Service
public class UserServiceImpl  implements UserService {

	private final UserRepository userRepository;
	
	
	public UserServiceImpl(UserRepository userRepository) {
		
		this.userRepository = userRepository;
	}

	@Override
	public User findById(Long id) {
		return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
		
	}/////////

	@Override
	public User create(User userToCreate) {
		if(userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())) {
			throw new IllegalArgumentException("This Account number already exists");
		}
		
		return userRepository.save(userToCreate);
	}

}

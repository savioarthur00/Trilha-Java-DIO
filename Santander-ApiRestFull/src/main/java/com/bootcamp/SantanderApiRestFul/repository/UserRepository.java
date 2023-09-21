package com.bootcamp.SantanderApiRestFul.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bootcamp.SantanderApiRestFul.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
	boolean existsByAccountNumber(String accountNumber);

}

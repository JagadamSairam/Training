package com.cts.training.userservice;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
	public UserEntity findByEmail(String email);
	
	//@Query("From UserEntity where username=?1 and password=?2")
	public Optional<UserEntity> findByUsernameAndPassword(String username, String password);

}

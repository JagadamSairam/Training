package com.cts.training.userservice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
	public UserEntity findByEmail(String email);
	//public boolean findByUserNameAndPassword(UserEntity user);

}

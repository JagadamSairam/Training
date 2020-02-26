package com.example.demo.dao.copy;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Register;

public interface RegisterDao extends JpaRepository<Register, Integer> {
//	public List<Register> findbyUsername(String username);
//public static Register findbyEmail(String email) {
//	// TODO Auto-generated method stub
//	return null;
//}

}

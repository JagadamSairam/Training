package com.example.demo.dao.copy;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Register;

public interface RegisterDao extends JpaRepository<Register, Integer> {

}

package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.copy.RegisterDao;
import com.example.demo.dto.RegisterDTO;
import com.example.demo.model.Register;
import com.example.demo.services.RegisterService;

@CrossOrigin(origins = "*")
@RestController
public class RegisterController {

	
	@Autowired
	RegisterService rs;
	
	@Autowired
	RegisterDao rd;
	
	@Autowired
	JavaMailSender jms;

	@GetMapping(value = "/registerUser")
	public List<RegisterDTO> getAllUsers(){
		return rs.getAllUsers();
	}
	
	
	
	
	
	@PutMapping(value="/activate")
	public Register activate(@RequestBody String email) {
		String str=email.substring(email.indexOf(":")+2,email.lastIndexOf("\""));
	System.out.println("emil ::"+str);
	Register u=	rd.findByEmail(str);
	System.out.println("uname :"+u.getUsername());
	u.setActive("yes");
		Register us = rd.save(u);
return us;
	}
	
	
	@GetMapping(value = "/registerUser/{id}")
	public Register findOne(@PathVariable int id) {
		Optional<Register> reg = rd.findById(id);
		Register r = reg.get();
		return r;
	}
	
	@PostMapping(value = "/registerUser")
	public String save(@RequestBody RegisterDTO reg) {
		//RegisterDTO user;
		String usermail;
		usermail=rs.addUser(reg);
		return usermail;
//		try {
//			SimpleMailMessage sm = new SimpleMailMessage();
//			sm.setFrom("jagadamsairam@gmail.com");
//			sm.setTo(reg.getEmail());
//			usermail=reg.getEmail();
//			if(rd.findByEmail(usermail)!= null) {
//				return "{\"res\":\"0\"}";
//			}
//			else {
//				user=rs.addUser(reg);
//			sm.setSubject("testing mail...");
//			
//			sm.setText("Account created click on 'http://localhost:1111/activate?" + user.getEmail()
//					+ "'");
//			jms.send(sm);
//			
//			System.out.println("sending mail...");
//			return "{\"res\":\"1\"}";
//		}
//		}catch (Exception e) {
//			e.printStackTrace();
//			return "{\"res\":\"2\"}";
//
//		}
	}


	@DeleteMapping(value = "/registerUser/{id}")
	public void deleteUser(@PathVariable int id) {
		rs.deleteUser(id);
	}

	@PutMapping(value = "/registerUser")
	public String updateUser(@RequestBody RegisterDTO user) {
		String reg = rs.addUser(user);
		return reg;
	}
}

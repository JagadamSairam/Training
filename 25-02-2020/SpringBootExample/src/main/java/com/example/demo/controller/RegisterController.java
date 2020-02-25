package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
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
import com.example.demo.model.Register;

@CrossOrigin(origins = "*")
@RestController
public class RegisterController {

	@Autowired
	RegisterDao rd;
	@Autowired
	JavaMailSender jms;

	@GetMapping(value = "/registerUser")
	public List<Register> findAll() {
		return rd.findAll();
	}

	@RequestMapping(value = "/registerUsermail", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public String reg() {
		try {
			SimpleMailMessage sm = new SimpleMailMessage();
			sm.setFrom("jagadamsairam@gmail.com");
			sm.setTo("jagadamsairam@gmail.com");
			sm.setSubject("testing mail...");

			//sm.setText("Account created click on <a href ='http://localhost:1111/activate?" + user.getEmail()
			//		+ "'>Click</a>");
			//jms.send(sm);
//			sm.setText("Account created click on <a href='http://localhost:1111/registerUser/activate?'>Click</a>");
//			jms.send(sm);
			System.out.println("sending mail...");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "{\"registerUser\":\"ok\"}";
	}

//	@PutMapping(value = "/registerUser/activate")
//	public boolean activateUser(@RequestBody String email) {
//		System.out.println(email);
//		Register user = RegisterDao.findbyEmail(email);
//		System.out.println(user);
//		if(!user.isConfirmed()) {
//			System.out.println(user);
//			user.setConfirmed(true);
//			userRepo.save(user);
//			return true;
//		}
//		else {
//			return false;
//		}
//	}
	
	@GetMapping(value = "/registerUser/{id}")
	public Register findOne(@PathVariable int id) {
		Optional<Register> reg = rd.findById(id);
		Register r = reg.get();
		return r;
	}

	@PostMapping(value = "/registerUser")
	public Register save(@RequestBody Register reg) {
		Register user = rd.save(reg);
		//Register user= null;
		
		
		return user;
	}

	@DeleteMapping(value = "/registerUser/{id}")
	public void deleteUser(@PathVariable int id) {
		rd.deleteById(id);
	}

	@PutMapping(value = "/registerUser")
	public Register updateUser(@RequestBody Register user) {
		Register reg = rd.save(user);
		return reg;
	}
}

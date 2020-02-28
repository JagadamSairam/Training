package com.example.demo.servicesimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.example.demo.dao.copy.RegisterDao;
import com.example.demo.dto.RegisterDTO;
import com.example.demo.model.Register;
import com.example.demo.services.RegisterService;

@Service
public class RegisterServiceImpl implements RegisterService{

	@Autowired
	RegisterDao user;
	@Autowired
	JavaMailSender jsm;
	
	@Override
	public String addUser(RegisterDTO user1) {
		Register reg=new Register();
		String mail;
		try {
			SimpleMailMessage sm= new SimpleMailMessage();
			sm.setFrom("jagadamsairam@gmail.com");
			sm.setTo(user1.getEmail());
			mail=user1.getEmail();
			if(user.findByEmail(mail)!= null) {
				return "{\"res\":\"0\"}";
			}
			else {
				BeanUtils.copyProperties(user1, reg);
				user.save(reg);
				sm.setSubject("Activation Mail");
				sm.setText("Account Created Click on 'http://localhost:1111/activate?"+reg.getEmail()+"'");
				jsm.send(sm);
				System.out.println("Sending Mail.........");
				return "{\"res\":\"1\"}";
			}
		}
		catch(Exception e){
			e.printStackTrace();
			return "{\"res\":\"2\"}";
			
			
		}
		
		
		
	}
	
	@Override
	public List<RegisterDTO> getAllUsers(){
		List<Register> entities = user.findAll();
		List<RegisterDTO> usersDTO = new ArrayList<RegisterDTO>();
		for(Register entity: entities) {
			RegisterDTO userDTO = new RegisterDTO();
			BeanUtils.copyProperties(entity, userDTO);
			usersDTO.add(userDTO);
		}
		System.out.println("Entity: "+entities);
		System.out.println("DTO: "+usersDTO);
		return usersDTO;
	}

	
	
	@Override
	public void deleteUser(int id) {
		user.deleteById(id);
	}

	@Override
	public RegisterDTO getUserById(int id){
		Optional<Register> users = user.findById(id);
		RegisterDTO userDTO = new RegisterDTO();
		BeanUtils.copyProperties(users.orElse(new Register()), userDTO);
		return userDTO;
	}
//
//	@Override
//	public RegisterDTO getById(int id) {
//		//Register reg=user.findById(id)
//		
//		return null;
//	}

	@Override
	public RegisterDTO updateUser(RegisterDTO user) {
		// TODO Auto-generated method stub
		return null;
	}

//	
//	@Override
//	public boolean activateUser(String email) {
//		System.out.println(email);
//		Register users = user.findByEmail(email).get();
//		System.out.println(users);
//		if(!users.isConfirmed()) {
//			System.out.println(users);
//			users.setConfirmed(true);
//			user.save(users);
//			return true;
//		}
//		else {
//			return false;
//		}
//	}
	
//	public RegisterDTO updateUser(RegisterDTO users) {
//		Register userEntity = new Register();
//		BeanUtils.copyProperties(users, userEntity);
//		BeanUtils.copyProperties(rd.save(userEntity), users);
//		return users;
//	}

}

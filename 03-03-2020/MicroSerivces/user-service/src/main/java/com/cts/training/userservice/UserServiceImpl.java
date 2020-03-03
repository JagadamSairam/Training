package com.cts.training.userservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;
	@Autowired
	JavaMailSender javaMailSender;
	
	@Override
	public String addUser(UserEntity user1) {
		UserEntity reg=new UserEntity();
		String mail;
		try {
			SimpleMailMessage simpleMailMessage= new SimpleMailMessage();
			simpleMailMessage.setFrom("jagadamsairam@gmail.com");
			simpleMailMessage.setTo(user1.getEmail());
			mail=user1.getEmail();
			if(userRepository.findByEmail(mail)!= null) {
				return "{\"res\":\"0\"}";
			}
			else {
				BeanUtils.copyProperties(user1, reg);
				userRepository.save(reg);
				simpleMailMessage.setSubject("Activation Mail");
				simpleMailMessage.setText("Account Created Click on 'http://localhost:1111/activate?"+reg.getEmail()+"'");
				javaMailSender.send(simpleMailMessage);
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
	public List<UserEntity> getAllUsers(){
		List<UserEntity> users = userRepository.findAll();
//		List<UserEntity> users = new ArrayList<UserEntity>();
//		for(UserEntity entity: entities) {
//			UserEntity userEntities= new UserEntity();
//			BeanUtils.copyProperties(entity, userEntities);
//			users.add(userEntities);
//		}
//		System.out.println("Entity: "+entities);
//		System.out.println("DTO: "+users);
		return users;
	}

	
	
	@Override
	public void deleteUser(int id) {
		userRepository.deleteById(id);
	}

	@Override
	public UserEntity getUserById(int id){
		Optional<UserEntity> users = userRepository.findById(id);
		UserEntity userEntities = new UserEntity();
		BeanUtils.copyProperties(users.orElse(new UserEntity()), userEntities);
		return userEntities;
	}


	@Override
	public UserEntity updateUser(UserEntity user) {
		UserEntity userEntity = new UserEntity();
		BeanUtils.copyProperties(user, userEntity);
		userRepository.save(userEntity);
		return user;

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
	


}

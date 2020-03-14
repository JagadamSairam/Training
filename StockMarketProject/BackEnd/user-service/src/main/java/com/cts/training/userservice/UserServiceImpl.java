package com.cts.training.userservice;

import java.util.List;
import java.util.Optional;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;
	@Autowired
	JavaMailSender javaMailSender;
	
//	@Override
//	public String addUser(UserEntity user1) {
//		UserEntity reg=new UserEntity();
//		String mail;
//		try {
//			SimpleMailMessage simpleMailMessage= new SimpleMailMessage();
//			simpleMailMessage.setFrom("jagadamsairam@gmail.com");
//			simpleMailMessage.setTo(user1.getEmail());
//			mail=user1.getEmail();
//			if(userRepository.findByEmail(mail)!= null) {
//				return "{\"res\":\"0\"}";
//			}
//			else {
//				BeanUtils.copyProperties(user1, reg);
//				userRepository.save(reg);
//				simpleMailMessage.setSubject("Activation Mail");
//				simpleMailMessage.setText("Account Created Click on 'http://localhost:1111/activate?"+reg.getEmail()+"'");
//				javaMailSender.send(simpleMailMessage);
//				System.out.println("Sending Mail.........");
//				return "{\"res\":\"1\"}";
//			}
//		}
//		catch(Exception e){
//			e.printStackTrace();
//			return "{\"res\":\"2\"}";
//			
//			
//		}
		
		
//	}
	
//	@Override
//	public UserEntity addUser(UserEntity user) {
//		userRepository.save(user);
//		try {
//			SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
//			simpleMailMessage.setFrom("jagadamsairam@gmail.com");
//			simpleMailMessage.setTo(user.getEmail());
//			simpleMailMessage.setSubject("verfication mail");
//			simpleMailMessage.setText("Account created click on <a href='http://localhost:1111/activate?"+user.getEmail()+"'>Click</a>");
//			javaMailSender.send(simpleMailMessage);
//			System.out.println("sending mail.....");
//			}
//		catch(Exception e) {e.printStackTrace();}
//		return user;
//	}
	
	
	@Override
	public UserEntity addUser(UserEntity register) {
			UserEntity user = new UserEntity();
			try {
				MimeMessage mimeMessage=javaMailSender.createMimeMessage();
				MimeMessageHelper helper=new MimeMessageHelper(mimeMessage,"utf-8");
				helper.setFrom("tanusreevidya13@gmail.com");			
				helper.setTo(register.getEmail());
				helper.setSubject("verification mail");
				//sm.setText("This is testing mail");
				helper.setText("Account created click on <a href='http://localhost:1111/activate?"+register.getEmail()+"'>Click Here To Verify</a>",true);
				javaMailSender.send(mimeMessage);
				//logger.info("sending mail..");
				BeanUtils.copyProperties(register, user);
				userRepository.save(user);
			}
		catch(Exception e) {e.printStackTrace();}
		return register;
	}
	
	
	@Override
	public String activate(@RequestBody String email) {
		String str=email.substring(email.indexOf(":")+2,email.lastIndexOf("\""));
	System.out.println("emil ::"+str);
	UserEntity user=	userRepository.findByEmail(str);
	System.out.println("uname :"+user.getEmail());
	user.setActive(true);
    user = userRepository.save(user);
       return "{\"status\":\"ok\"}";
	}
	
	@Override
	public List<UserEntity> getAllUsers(){
		List<UserEntity> users = userRepository.findAll();

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

	@Override
	public UserEntity getUserByUsernameAndPassword(String username, String password) {
		UserEntity user=userRepository.findByUsernameAndPassword(username, password).get();
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

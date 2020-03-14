package com.cts.training.userservice;

import org.springframework.web.bind.annotation.RestController;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@CrossOrigin(origins = "*")
@RestController
public class UserController {
	Logger logger=LoggerFactory.getLogger(this.getClass());

	@Autowired
	UserService userService;

	@Autowired
	UserRepository userRepository;

//	@GetMapping(value = "/registerUser")
//	public ResponseEntity<?> getAllUsers() {
//		List<UserEntity> list = userService.getAllUsers();
//		if (list.size() > 0) {
//			return new ResponseEntity<List<UserEntity>>(list, HttpStatus.OK);
//
//		} else {
//			return new ResponseEntity<String>("User Not Found", HttpStatus.NOT_FOUND);
//		}
//	}
//
////	@PutMapping(value = "/activate")
////	public UserEntity activate(@RequestBody String email) {
////		String str = email.substring(email.indexOf(":") + 2, email.lastIndexOf("\""));
////		System.out.println("emil ::" + str);
////		UserEntity u = userRepository.findByEmail(str);
////		System.out.println("uname :" + u.getUsername());
////		u.setActive("yes");
////		UserEntity userEntity = userRepository.save(u);
////		return userEntity;
////	}
//
//	@GetMapping(value = "/registerUser/{id}")
//	public UserEntity findOne(@PathVariable int id) {
//		Optional<UserEntity> user = userRepository.findById(id);
//		UserEntity users = user.get();
//		return users;
//	}
//
//	@PutMapping(value = "/activate")
//	public ResponseEntity<String> activate(@RequestBody String email){
//		userService.activate(email);
//		return new ResponseEntity<String>(email,HttpStatus.CREATED);
//	}
//	@DeleteMapping(value = "/registerUser/{id}")
//	public void deleteUser(@PathVariable int id) {
//		userService.deleteUser(id);
//	}
//	@PostMapping(value="/registerUser")
//	public ResponseEntity<?> addUser(@RequestBody UserEntity register){
//	try {
//		userService.addUser(register);
//		return new ResponseEntity<UserEntity>(register, HttpStatus.OK);
//   	}catch (Exception e) {
//   		return new ResponseEntity<String>("cannot add user", HttpStatus.NOT_FOUND);
//   	}
//}
//
//	@PutMapping(value = "/registerUser")
//	public UserEntity update(@RequestBody UserEntity user) {
//		UserEntity users= userService.updateUser(user);
//		return users;
//	}
	
	@GetMapping(value="/login")
	public ResponseEntity<?> login(HttpServletRequest request){
		String authorization= request.getHeader("Authorization");
		logger.info("Loged in the system by using token--> {} " , authorization);
		String username= null;
		String password=null;
		if(authorization !=null && authorization.startsWith("Basic")) {
			String base64Credentials = authorization.substring("Basic".length()).trim();
			byte[] credDecoded= Base64.getDecoder().decode(base64Credentials);
			String credentials = new String(credDecoded, StandardCharsets.UTF_8);
			username=credentials.split(":")[0];
			password=credentials.split(":")[1];
			logger.info("Username --> {}",username);
			logger.info("Password --> {}",password);
		}
		
		try {
			UserEntity user=userService.getUserByUsernameAndPassword(username,password);
			logger.info("Login Successfull by the User --> {}" ,user);
			return new ResponseEntity<UserEntity>(user,HttpStatus.OK);
		}
		catch(Exception e) {
			//logger.info("Causing some error --> {}");
			System.out.println(e.getStackTrace());
			logger.info("You Are not Supposed to acces --> {}", e.getStackTrace().getClass());
			return new ResponseEntity<String>("No users Found", HttpStatus.BAD_REQUEST);
		}
		//return new ResponseEntity<HttpStatus>(HttpStatus.OK);
	}
	
	@GetMapping(value="/registerUser",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getAllUsers(){
		List<UserEntity> list = userService.getAllUsers();
		if(list.size()>0) {
			return new ResponseEntity<List<UserEntity>>(list, HttpStatus.OK);
		}
		else {
			return new ResponseEntity<String>("No users found",HttpStatus.OK);
		}
	}
	@GetMapping(value="/registerUser/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getUserById(@PathVariable int id)
	{
		try {
			UserEntity register =  userService.getUserById(id);
			return new ResponseEntity<UserEntity>(register, HttpStatus.OK);
		}catch(NoSuchElementException e){
			return new ResponseEntity<String>("no such user", HttpStatus.OK);
		}
	}
	@PostMapping(value="/registerUser")
	public ResponseEntity<?> addUser(@RequestBody UserEntity register){
	try {
		userService.addUser(register);
		return new ResponseEntity<UserEntity>(register, HttpStatus.OK);
   	}catch (Exception e) {
   		return new ResponseEntity<String>("cannot add user", HttpStatus.BAD_REQUEST);
   	}
}
	@DeleteMapping(value="/registerUser/{id}")
	//public void  deleteUser(@PathVariable int id){
	public ResponseEntity<?> deleteUser(@PathVariable int id){
		try {
		 userService.deleteUser(id);
		return new ResponseEntity<UserEntity>( HttpStatus.OK);
	}
		catch(Exception e) {
			return new ResponseEntity<UserEntity>( HttpStatus.OK);
		}
	}
	@PutMapping(value = "/registerUser")
	public ResponseEntity<UserEntity> update(@RequestBody UserEntity register) {
	register = userService.updateUser(register);
	return new ResponseEntity<UserEntity>(register,HttpStatus.OK);
	}
	@PutMapping(value="/activate")
	public ResponseEntity<String> activate(@RequestBody String email){
		userService.activate(email);
		return new ResponseEntity<String>(email,HttpStatus.CREATED);
	}
	
//	@GetMapping(value="/checklogin")
//	public boolean isPresent(@RequestBody UserEntity user) {
//		
//		Optional<UserEntity> users=userRepository.findByUserNameAndPassword(user)
//		
//		return false;
//	}
}

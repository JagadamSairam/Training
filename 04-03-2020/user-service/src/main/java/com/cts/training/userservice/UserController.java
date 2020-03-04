package com.cts.training.userservice;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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

	@Autowired
	UserService userService;

	@Autowired
	UserRepository userRepository;

	@GetMapping(value = "/registerUser")
	public ResponseEntity<?> getAllUsers() {
		List<UserEntity> list = userService.getAllUsers();
		if (list.size() > 0) {
			return new ResponseEntity<List<UserEntity>>(list, HttpStatus.OK);

		} else {
			return new ResponseEntity<String>("User Not Found", HttpStatus.NOT_FOUND);
		}
	}

	@PutMapping(value = "/activate")
	public UserEntity activate(@RequestBody String email) {
		String str = email.substring(email.indexOf(":") + 2, email.lastIndexOf("\""));
		System.out.println("emil ::" + str);
		UserEntity u = userRepository.findByEmail(str);
		System.out.println("uname :" + u.getUsername());
		u.setActive("yes");
		UserEntity userEntity = userRepository.save(u);
		return userEntity;
	}

	@GetMapping(value = "/registerUser/{id}")
	public UserEntity findOne(@PathVariable int id) {
		Optional<UserEntity> user = userRepository.findById(id);
		UserEntity users = user.get();
		return users;
	}

	@PostMapping(value = "/registerUser")
	public String save(@RequestBody UserEntity reg) {
		String usermail;
		usermail = userService.addUser(reg);
		return usermail;
	}

	@DeleteMapping(value = "/registerUser/{id}")
	public void deleteUser(@PathVariable int id) {
		userService.deleteUser(id);
	}

	@RequestMapping(value = "/registerUser", method = RequestMethod.PUT)
	public UserEntity update(@RequestBody UserEntity user) {
		UserEntity users= userService.updateUser(user);
		return users;
	}
}

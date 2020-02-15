package com.cts.training.controller;
import java.util.List;
import javax.swing.text.html.FormSubmitEvent.MethodType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cts.training.dao.UserDao;
import com.cts.training.model.User;

@Controller
public class UserController {
	@Autowired
	UserDao userDao;
	@GetMapping("/user-home")
	public String userPage(Model model)
	{
		model.addAttribute("user", new User());//registe rwill work as a medel attribute in the form
		//Register user=new Register();
		List<User> users=userDao.getAllUsers();
		model.addAttribute("userlist", users);
		return "user";
	}
	@PostMapping("/user/save")
	//@RequestMapping(value="/user/save",method=RequestMethod.POST)
	public String addUser(@ModelAttribute("user") User user){
		userDao.saveOrUpdateUser(user);
		return "redirect:/user-home";
	}
	@GetMapping("/removeuser/{id}")
	public String deleteUser(@PathVariable("id")int id)
	{
		User user= userDao.getUserById(id);
		userDao.deleteUser(user);
		return "redirect:/user-home";
	}
	@GetMapping("/updateuser/{id}")
	public String updateUser(@PathVariable("id") int id, Model model)
	{
		User user= userDao.getUserById(id);
		model.addAttribute("user",user);
		List<User> users=userDao.getAllUsers();
		model.addAttribute("userlist", users);
		return "user";
	}
}
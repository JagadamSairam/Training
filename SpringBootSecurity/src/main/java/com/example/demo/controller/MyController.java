package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {

	@Autowired
	MyUSerDetailsService ser;
	
	@Autowired
	UserRepository repo;
	
	@RequestMapping("/")
	public String home(ModelMap m) {
		String password = "raja";
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String hashedPassword = passwordEncoder.encode(password);
		m.addAttribute("pwd", hashedPassword);
		m.addAttribute("usr","good morning");
		System.out.println(hashedPassword);
		return "welcome.jsp";
	}
	
	@RequestMapping("/login")
	public String logpage() {
		System.out.println("Login called:::::::::============");
		return "Login.jsp";		
	}
	
	@RequestMapping("/welcome")
	public String logoutpage(ModelMap m) {
		System.out.println("Welcome called:::::::::============");
		String password = "raja";
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String hashedPassword = passwordEncoder.encode(password);
		m.addAttribute("pwd", hashedPassword);
		m.addAttribute("usr","good morning");
		System.out.println(hashedPassword);
	return "welcome.jsp";		
	}
	
	@RequestMapping("/register")
	public String regpage(ModelMap m,HttpServletRequest req) {
		//System.out.println("Login called:::::::::============");
		String usen=req.getParameter("username");
		String pwd=req.getParameter("password");
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String hashedPassword = passwordEncoder.encode(pwd);

		User u=new User();
		u.setId(13);
		u.setUsername(usen);
		u.setPassword(hashedPassword);
		repo.save(u);
		
		/*String password = "raja";
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String hashedPassword = passwordEncoder.encode(password);
		m.addAttribute("pwd", hashedPassword);
		m.addAttribute("usr","good morning");
		System.out.println(hashedPassword);
		*/
	return "welcome.jsp";		
	}
}

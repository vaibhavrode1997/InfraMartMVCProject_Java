package com.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.Beans.User;
import com.demo.Service.UserService;

@Controller
@RequestMapping("/registration")
public class Registration {

	@Autowired
	UserService userService;

	
	  @GetMapping("/register")
	  public String registration() 
	  { 
		  return "registration"; 
	  }
	  
	 
	@PostMapping("/save")
	public ModelAndView addUser(@RequestParam("fname") String fname, @RequestParam("lname") String lname,
			@RequestParam("email") String email, @RequestParam("password") String password,
			@RequestParam("phoneno") String phoneno, @RequestParam("role") String role,
			@RequestParam("address") String address)

	{
		User user = new User(fname, email, role, address, password, lname, phoneno);
		userService.addUser(user);

		return new ModelAndView("index");
	}

}

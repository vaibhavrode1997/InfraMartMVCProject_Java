package com.demo.Controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.Beans.User;
import com.demo.Service.UserService;


@Controller
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	UserService userService; 
	
	
	@PostMapping("/authentication")
	public ModelAndView authentication(HttpSession session, @RequestParam("email") String email,@RequestParam("password") String password)
	{		
		List<User> ulist= userService.getUser();
		if(ulist!=null)
		{
			for(User u:ulist)
			{
				if(u.getEmail().equals(email) && u.getPassword().equals(password))
				{
					session.setAttribute("user", u);
					if(u.getRole().equals("user"))
					{
						return new ModelAndView("redirect:/product/getProductUser");
					}
					else
					{
						return new ModelAndView("redirect:/product/getProductAdmin");
					}
				}
			}
		}
	
		return new ModelAndView("registration");	
	}
	

}

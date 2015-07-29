package com.deloitte.springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.deloitte.springmvc.model.User;
import com.deloitte.springmvc.service.LoginService;

@Controller
@RequestMapping(value="/login")
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	/**
	 * This method returns the login page for the user.
	 */
	@RequestMapping(value="/showLoginPage")
	public ModelAndView showLoginPage(@ModelAttribute("USER_DETAILS")User user){
		return new ModelAndView("login");
	}
	
	/**
	 * This method does the login check part, if the username and password matches, it returns the home page, else it returns the invalid login page with proper error message.
	 */
	@RequestMapping(value="/loginCheck", method = RequestMethod.POST)
	public ModelAndView checkLogin(HttpServletRequest request){
		// Read the username and password entered by user.
		String userName = request.getParameter("emailId");
		String password = request.getParameter("password");
		
		// Call the LoginService to get the details of the user by passing the username(email_id).
		User user = loginService.getUserDetails(userName);
		
		//Check the username and password.
		//If both are correct redirect the user to home page(home.jsp), else redirect the user to InvalidLogin (invalidLogin) page with the error message. 
		if(user.getEmailId().equals(userName) && user.getPassword().equals(password)){
			return new ModelAndView("home","userName",userName);
		} else{
			String invalidLoginMessage = "Invalid Username or Password.";
			return new ModelAndView("invalidLogin","message",invalidLoginMessage);
		}
	}
}
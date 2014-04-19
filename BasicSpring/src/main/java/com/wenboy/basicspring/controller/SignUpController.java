/**
 * 
 */
package com.wenboy.basicspring.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.SessionAttributes;

import org.springframework.web.bind.annotation.SessionAttributes;

import com.wenboy.basicspring.temp.MovieUser;

/**
 * @author wenbyuan
 *
 */
@Controller
@RequestMapping(value="/SignUp")
@SessionAttributes("MovieUser")
public class SignUpController {
	
	private static final Logger logger = LoggerFactory.getLogger(SignUpController.class);
	
	@RequestMapping(value="/")
	public void populateSignUpForm(){
	}
	
	@RequestMapping(value="/submit", method=RequestMethod.POST)
	public String processSubmit(MovieUser movieUser, BindingResult result, Model model){
		if(result.hasErrors())
			logger.error("Not binding attribute");
		else
			logger.info(movieUser.getUserFirstName()+" "+movieUser.getUserLastName());
			//logger.info("User Id: "+ user.getId());
			//user.setId("jack");
		return "redirect:/home";
		
	}
}

/**
 * 
 */
package com.wenboy.basicspring.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * @author wenbyuan
 *
 */
@Controller
@SessionAttributes("MovieUser")
public class SiteController {
	private static final Logger logger = LoggerFactory.getLogger(SiteController.class);
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String login(){
		return "home";
	}
	
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String showHomePage(){
		return "home";
	}
	
	@RequestMapping(value="/movies", method=RequestMethod.GET)
	public String showMovies(@RequestParam(value="title",required=false) String title, 
			@RequestParam(value="genre", required=false) String genre,
			Model model){
		String test1 = title;
		String test2 = title;
		System.out.println(test1);
		System.out.println(test2);
		model.addAttribute("title", title);
		model.addAttribute("genre", genre);
		return "movies";
	}
	
	@RequestMapping(value="/star", method=RequestMethod.GET)
	public String showStar(@RequestParam("name") String name, Model model){
		model.addAttribute("name", name);
		return "star";
	}
	
	@RequestMapping(value="/search", method=RequestMethod.GET)
	public String showSearchResult(@RequestParam("q") String q, Model model){
		model.addAttribute("query", q);
		return "temp";
	}
	
	@RequestMapping(value="/shoppingcart")
	public String showShoppingCart(){
		return "shoppingcart";
	}
}

/**
 * 
 */
package com.wenboy.basicspring.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



/**
 * @author wenbyuan
 *
 */
@Controller
@RequestMapping("/orders")
public class OrderController {
	private static final Logger logger = LoggerFactory.getLogger(OrderController.class); 
	
	@RequestMapping(method = RequestMethod.GET)
	public String showMessage(@RequestParam(value="name", required=false) String name, Model model){
		model.addAttribute("message", name);
		return "orders";
	}
	
	@RequestMapping(value="/{orderId}", method=RequestMethod.GET)
	public String showOrder(@PathVariable String orderId, Model model){
		model.addAttribute("message", orderId);
		return "orders";
	}
	
	@RequestMapping(value="/{orderName:[a-z-]-{version:\\d\\.\\d\\.\\d}{extension:\\.[a-z]}}",
			method=RequestMethod.GET)
	public String showPreviousOrder(@PathVariable String orderName, @PathVariable String version,
			@PathVariable String extension){
		return null;
	}
	
}

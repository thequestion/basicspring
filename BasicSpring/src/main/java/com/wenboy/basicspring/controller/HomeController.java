package com.wenboy.basicspring.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(value="/request", method=RequestMethod.GET)
	public void handleRequest(@RequestBody String body, Writer writer) throws IOException{
		writer.write(body);
	}
	
	@RequestMapping(value="/response", method=RequestMethod.GET)
	@ResponseBody
	public String handel() throws IOException{
		return "asdfasdf";
	}
	
	@RequestMapping(value="/entity")
	public ResponseEntity<String> handleEntity(HttpEntity<byte[]> requestEntity) throws UnsupportedEncodingException{
		String requestHeader = requestEntity.getHeaders().getFirst("MyRequestHeader");
		byte[] requestBody = requestEntity.getBody();
		
		HttpHeaders responseHeaders = new HttpHeaders();

		responseHeaders.set("MyResponseHeader", "MyValues");
		return new ResponseEntity<String>("hello world", responseHeaders, HttpStatus.CREATED);
	}
	
	
	
}
